package unidad2.examples;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DocumentBuilderForXMLCreation {

    public static void main(String[] args) {
        File datFile = new File("test1.dat");
        File xmlFile = new File("Empleados.xml");

        try {
            // Generar archivo de prueba (2 registros: uno con id negativo y otro con id 0)
            generarArchivoPrueba(datFile);

            // Leer el .dat y generar el XML
            crearXmlDesdeDat(datFile, xmlFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Genera test1.dat con dos registros (36 bytes cada uno)
    private static void generarArchivoPrueba(File datFile) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(datFile, "rw")) {
            raf.setLength(0); // limpiar archivo

            // registro 1 (id negativo) - se incluirá si usas la condición id < 0
            raf.writeInt(-1);
            writeFixedString(raf, "GARCIA", 10); // apellido 10 chars
            raf.writeInt(10); // departamento
            raf.writeDouble(1500.0); // salario

            // registro 2 (id no negativo)
            raf.writeInt(0);
            writeFixedString(raf, "DE LA ROSA", 10); // apellido 10 chars (se truncará/pad)
            raf.writeInt(2000);
            raf.writeDouble(2000.20);

            System.out.println("test1.dat generado en: " + datFile.getAbsolutePath() +
                    " (tamaño=" + raf.length() + " bytes)");
        }
    }

    // Escribe una cadena con exactamente 'length' caracteres usando writeChar (2 bytes por char)
    private static void writeFixedString(RandomAccessFile raf, String s, int length) throws IOException {
        StringBuilder sb = new StringBuilder(s);
        if (sb.length() > length) {
            sb.setLength(length);
        } else {
            while (sb.length() < length) sb.append(' ');
        }
        for (int i = 0; i < length; i++) {
            raf.writeChar(sb.charAt(i));
        }
    }

    // Lee test1.dat y genera Empleados.xml
    private static void crearXmlDesdeDat(File datFile, File xmlFile) throws Exception {
        if (!datFile.exists() || datFile.length() == 0) {
            System.out.println("El archivo " + datFile.getAbsolutePath() + " no existe o está vacío.");
            return;
        }

        // Preparar documento XML
        var factory = DocumentBuilderFactory.newInstance();
        var builder = factory.newDocumentBuilder();
        var impl = builder.getDOMImplementation();
        var document = impl.createDocument(null, "Empleados", null);
        document.setXmlVersion("1.0");

        try (RandomAccessFile raf = new RandomAccessFile(datFile, "r")) {
            final int RECORD_SIZE = 36; // 4 + 20 + 4 + 8
            // Leer mientras haya al menos un registro completo
            while (raf.getFilePointer() + RECORD_SIZE <= raf.length()) {
                int id = raf.readInt();

                StringBuilder apellido = new StringBuilder();
                for (int i = 0; i < 10; i++) {
                    apellido.append(raf.readChar());
                }
                int departamento = raf.readInt();
                double salario = raf.readDouble();

                // Depuración: mostrar lo leído
                System.out.printf("Leído registro: id=%d apellido=%s dep=%d salario=%.2f%n",
                        id, apellido.toString().trim(), departamento, salario);

                // Condición para incluir en el XML.
                // Cámbiala según tu criterio. Ahora se incluyen todos los registros.
                if (true) { // usar id < 0, id >= 0, id != 0, etc. según necesites
                    var empleado = document.createElement("empleado");
                    document.getDocumentElement().appendChild(empleado);

                    crearElemento("id", Integer.toString(id), empleado, document);
                    crearElemento("apellido", apellido.toString().trim(), empleado, document);
                    crearElemento("dep", Integer.toString(departamento), empleado, document);
                    crearElemento("salario" , Double.toString(salario), empleado, document);
                }
            }
        }

        // Escribir XML formateado
        if (!xmlFile.exists()) xmlFile.createNewFile();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(xmlFile);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty("encoding", "UTF-8");
        transformer.transform(source, result);

        System.out.println("XML generado correctamente en " + xmlFile.getAbsolutePath());
    }

    // Crea un elemento con texto y lo añade al nodo padre
    private static void crearElemento(String nombre, String valor, org.w3c.dom.Element padre,
            org.w3c.dom.Document document) {
        org.w3c.dom.Element elem = document.createElement(nombre);
        org.w3c.dom.Text text = document.createTextNode(valor);
        elem.appendChild(text);
        padre.appendChild(elem);
    }
}
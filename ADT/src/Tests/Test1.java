package Tests;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Test1 {
    public static void main(String[] args) {
        int ancho = 400;
        int alto = 300;

        BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);

        // Obtener el contexto gráfico
        Graphics2D g = imagen.createGraphics();

        // Pintar fondo
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, ancho, alto);

        // Dibujar un rectángulo rojo
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 100);

        // Dibujar texto
        g.setColor(Color.BLACK);
        g.drawString("¡Hola, imagen!", 100, 200);

        g.dispose(); // Liberar recursos

        // Guardar la imagen como archivo PNG
        try {
            ImageIO.write(imagen, "png", new File("imagen_generada.png"));
            System.out.println("Imagen guardada correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
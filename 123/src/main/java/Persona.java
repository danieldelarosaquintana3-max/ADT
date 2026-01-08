import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona")

public class Persona {
	@XmlAttribute
	private int id;
	
	private String nombre;
	private int edad;
	
	
	public Persona() {
	}
	
	public Persona(String nombre,int edad,int id) {
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@XmlElement
	public String getNombre() {return this.nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	
	@XmlElement
	public int getEdad() {return this.edad;}
	public void setEdad(int edad) {this.edad = edad;}
	
}

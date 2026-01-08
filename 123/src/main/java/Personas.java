import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personas")
public class Personas {
    private ArrayList<Persona> personas;

    public Personas() {}

    public Personas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @XmlElement(name = "persona") 
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}
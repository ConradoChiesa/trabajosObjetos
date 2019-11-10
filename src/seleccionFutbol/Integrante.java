package seleccionFutbol;

import java.util.Date;
import java.util.Vector;

public class Integrante {
    String nombre, apellido;
    int pasaporte;
    Date fchNac;

    Vector<Boolean> estados = new Vector<Boolean>();

    public Integrante (String n, String a, int pas, Date fn) {
        setNombre(n);
        setApellido(a);
        setPasaporte(pas);
        setFchNac(fn);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void setFchNac(Date fchNac) {
        this.fchNac = fchNac;
    }
}

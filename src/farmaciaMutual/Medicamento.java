package farmaciaMutual;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Medicamento {
    String nombre;
    int precio;
    Set<String> sintomas = new HashSet<String>();

    public Medicamento(String n, int p) {
        this.nombre = n;
        this.precio = p;
    }

    public int getPrecio() {
        return precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) { this.precio = precio; }

    public void addSintoma(String s) {
        //if (!sintomas.contains(s))
            sintomas.add(s);
        //else System.out.println("El sintoma ya existe");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicamento med = (Medicamento) o;
        return Objects.equals(nombre, med.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

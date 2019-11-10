package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<Contacto>();

    }

    public void addContacto(Contacto c) {
        if (c!=null && !contactos.contains(c)) {
            contactos.add(c);
            System.out.println("El contacto se agrego exitosamente");

        } else {
            System.out.println("El contacto ya existe");
        }
    }

    public boolean existeContacto(Contacto c) {
        if (c!=null && contactos.equals(c)){
            return true;
        }
        return false;
    }
    public void listarContactos(){

        Iterator<Contacto> it = contactos.iterator();
        while(it.hasNext()) {
            it.next().toString();

        }
    }

    public void buscarPorNombre(String nombre) {
        //boolean encontrado=false;
        for (Contacto contacto :
                contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contacto.toString();
            }
        }
    }

    public void removeContacto(Contacto c) {
        Iterator<Contacto> it = contactos.iterator();
        while (it.hasNext()) {
            if (contactos.equals(c)) {
                contactos.remove(c);
            }
        }
    }
}

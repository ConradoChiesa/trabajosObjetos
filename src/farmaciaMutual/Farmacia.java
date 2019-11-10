package farmaciaMutual;

import java.util.ArrayList;
import java.util.Iterator;

public class Farmacia {
    ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
    ArrayList<Paciente> paciente = new ArrayList<Paciente>();
    public Farmacia() {

    }

    public void evaluarVenta(Medicamento m, Paciente p) {

      //  if () {
            System.out.println("El paciente es alrgico a este medicamento");
       // }

       // if (p.getSintomas().contains(m))
        Iterator<Medicamento> itMed = medicamento.iterator();
        while (itMed.hasNext()) {
            //Examinar si el medicamento cubre todos los sintomas
        }
    }

    public double determinarValor(Medicamento m, Paciente p) {
        return (m.getPrecio() * p.getCobertura()) / 100;
    }


}

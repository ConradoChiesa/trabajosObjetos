package farmaciaMutual;

import java.util.ArrayList;

public class Paciente implements Cobertura {
    private String mutual;
    private int cobertura;

    private ArrayList<String> sintomas = new ArrayList<String>();

    public Paciente(String m, int c, String s) {

        this.mutual = m;
        this.cobertura = c;
        this.sintomas.add(s);
    }

    public void addSintoma(String s) {
        if (!sintomas.contains(s))
            sintomas.add(s);
        else
            System.out.println("El sintoma ya existe");
    }

    public String getMutual() {
        return mutual;
    }

    public void setMutual(String mutual) {
        this.mutual = mutual;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public int getCobertura() {
        return cobertura;
    }



    public ArrayList<String> getSintomas() {
        return sintomas;
    }

}

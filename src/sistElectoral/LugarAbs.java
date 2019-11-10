package sistElectoral;

import java.util.HashSet;
import java.util.Set;

public abstract class LugarAbs {
    private String nombre;
    private Set<Candidato> candidatos;
    public LugarAbs(String nombre) {
        this.nombre = nombre;
        this.candidatos = new HashSet<>();
    }

    abstract double getCantVotos();
    abstract double getCantVotosCandidato(Candidato c);
    double getPorcentajeVotos(Candidato c) { return (this.getCantVotosCandidato(c)/this.getCantVotos()) *100; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCandidato(Candidato c) {
        candidatos.add(c);
    }
}

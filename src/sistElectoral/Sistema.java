package sistElectoral;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sistema {
    private ArrayList<LugarAbs> lugarVotacion = new ArrayList<>();
    private Set<Candidato> candidatos = new HashSet<>();


    public void getPorcentajeVotos(Candidato c, Mesa m) {
        System.out.println("El porcentaje de votos para el candidato: "+c.getNombre()+"es de %"+m.getPorcentajeVotos(c));

    }

    public void getPorcentajeVotos(Candidato c, String ubicacion) {
        int mesasEscrutadas = 0;
        double porcentajeVotos = 0;
        for (LugarAbs lugar :
                lugarVotacion) {
            if (lugar.getNombre().equalsIgnoreCase(ubicacion)) {
                porcentajeVotos += lugar.getPorcentajeVotos(c);
                mesasEscrutadas++;
            }
        }
        porcentajeVotos = porcentajeVotos / mesasEscrutadas;
        System.out.println("El porcentaje de votos para el candidato: "+c.getNombre()+"en la ubicación:"+ubicacion+"es de %"+porcentajeVotos);
    }
    public void addCandidato(Candidato c) {
        //if (candidatos.equals(c.getClass())) {
            candidatos.add(c);
          //  System.out.println("Se agrego al candidato "+c.toString());
        //} else {
          //  System.out.println("No pudo agregarse al candidato");
        //}

    }

    public Set<Candidato> getCandidatos() {
        return candidatos;
    }
}

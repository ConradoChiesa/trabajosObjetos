package sistElectoral;
import java.util.ArrayList;
public class LugarDeVotacion extends LugarAbs {
    ArrayList<LugarAbs> ubicaciones;

    public LugarDeVotacion(String nombre) {
        super(nombre);
        this.ubicaciones = new ArrayList<>();
    }

    @Override
    double getCantVotos() {
        double suma = 0;
        for (LugarAbs u :
                ubicaciones) {
            suma += u.getCantVotos();
        }
        return suma;
    }

    @Override
    double getCantVotosCandidato(Candidato c) {
        double suma = 0;
        for (LugarAbs u :
                ubicaciones) {
            suma += u.getCantVotosCandidato(c);
        }
        return suma;
    }

    public void addMesa(Mesa m) {

        ubicaciones.add(m);
    }

}

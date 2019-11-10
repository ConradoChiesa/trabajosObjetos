package farmaciaMutual;

import java.util.ArrayList;

public class PacienteAlergico extends Paciente {

    private ArrayList<Medicamento> alergico;

    public PacienteAlergico(String m, int c, String s) {
        super(m, c, s);
        alergico = new ArrayList<>();
    }

    public boolean isAlergico(Medicamento m) {

        for (int i = 0; i < alergico.size(); i++) {

            if (alergico.get(i).equals(m)) {
                return true;
            }
        }
        return false;
    }
}

package sistElectoral;

public class Votante {
    int dni;
    Candidato cand;

    public Votante(int dni) {
        this.dni = dni;
    }

    private void elegirCandidato(Candidato c) {
        this.cand = c;
    }

    public Voto emitirVoto(Candidato c, Mesa m) {
        elegirCandidato(c);
        Voto voto = null;
        if (cand!=null) {
            voto = new Voto(cand);
            m.registrarVoto(voto, this);
        }
        return voto;
    }

    public int getDni() {
        return dni;
    }

}

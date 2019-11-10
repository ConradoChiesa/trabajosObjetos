package sistElectoral;

import java.util.Date;

public class Voto {
    Candidato candidato;
    Date date;

    public Voto(Candidato c){
        this.candidato = c;
        this.date = new Date();
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public Date getDate() {
        return date;
    }
}

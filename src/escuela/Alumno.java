package escuela;
public class Alumno extends Persona {
    private int nota;

    public Alumno() {
        super();
        super.setEdad(Sueltos.generaNumerRandom(12,15));
        nota = Sueltos.generaNumerRandom(0,10);
    }

    @Override
    public void disponibilidad() {
        int prob = Sueltos.generaNumerRandom(0,100);
        if (prob < 50){
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

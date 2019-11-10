package escuela;

public class Profesor extends Persona {
    private String materia;
    public Profesor() {
        super();
        super.setEdad(Sueltos.generaNumerRandom(25,50));
        materia = Constantes.MATERIAS[Sueltos.generaNumerRandom(0,2)];
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void disponibilidad() {
        int prob = Sueltos.generaNumerRandom(0,100);
        if (prob < 20) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }
}

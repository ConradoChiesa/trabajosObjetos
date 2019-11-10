package escuela;

public class Aula {
    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;

    private final int MAX_ALUMNOS = 20;

    public Aula() {
        id = 1;
        profesor = new Profesor();
        alumnos = new Alumno[MAX_ALUMNOS];
        crearAlumnos();
        materia = Constantes.MATERIAS[Sueltos.generaNumerRandom(0,2)];

    }

    private void crearAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
        }
    }

    public boolean darClase() {
        if (profesor.isAsistencia()) {
            System.out.println("El profesor no esta, no se puede dar clases");
            return false;
        } else if (!profesor.getMateria().equals(materia)) {
            System.out.println("El profesor no puede dar esta materia");
            return false;
        } else if (asistenciaAlumnos()) {
            System.out.println("La asistencia no es suficiente");
            return false;
        }
        System.out.println("Se puede dar clase");
        return true;
    }

    private boolean asistenciaAlumnos() {
        int asistencia = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].isAsistencia())
                    asistencia++;
        }
        return (asistencia >= (int)MAX_ALUMNOS/2);

    }

    public void notas() {
        int aprobados = 0, aprobadas = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() >= 5) {
                if (alumnos[i].getSexo() == 'H')
                    aprobados++;
                else aprobadas++;
            }

        }
    }

}

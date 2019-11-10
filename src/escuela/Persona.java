package escuela;

public abstract class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;

    private final String[] NOMBRES_CHICOS={"Pepe", "Fernando", "Alejandro", "Nacho", "Martin"};
    private final String[] NOMBRES_CHICAS={"Alicia", "Laura", "Clotilde", "Pepa", "Elena"};
    private final int CHICO = 0;
    private final int CHICA = 1;

    public Persona() {
    int determinar_sexo = Sueltos.generaNumerRandom(0,1);
    if (determinar_sexo == CHICO) {
        nombre=NOMBRES_CHICOS[Sueltos.generaNumerRandom(0,4)];
        sexo = 'H';
    } else {
        nombre=NOMBRES_CHICAS[Sueltos.generaNumerRandom(0,4)];
        sexo = 'M';

    }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public abstract void disponibilidad();
}

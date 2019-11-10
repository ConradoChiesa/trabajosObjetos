package parcialito1;

public class Simulador {

    public static void main(String[] args) {
        CentroComputos c1 = new CentroComputos(5, 5);
        c1.addCpu(5,2);
        c1.addCpu(4,4);
        c1.addCpu(12,2);
        c1.addTarea("Tarea 1", 2);
        c1.addTarea("tarea 2", 3);
        System.out.println(c1.getNumCpus());
        System.out.println(c1.getNumtareas());

    }
}

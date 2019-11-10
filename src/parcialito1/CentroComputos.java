package parcialito1;

public class CentroComputos {
    private final static int maxC = 10;
    private final static int maxT = 10;
    private Computadora [] cpus;
    private Tarea [] tareas;
    private int cpuCount;
    private int tareaCount;

    public CentroComputos(int compu, int tarea) {
        cpus = new Computadora[maxC];
        tareas = new Tarea[maxT];
    }

    public void setCpus(Computadora[] cpus) {
        this.cpus = cpus;
    }

    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public void setTareaCount(int tareaCount) {
        this.tareaCount = tareaCount;
    }


    public void addCpu(int vel, int memo) {
        if (this.cpuCount < maxC) {
            this.cpus[cpuCount] = new Computadora(vel, memo);
            cpuCount++;
        }
    }

    public void addTarea(String nombre, int memReq) {
        if (this.tareaCount < maxT) {
            this.tareas[tareaCount] = new Tarea(nombre, memReq);
            this.tareaCount++;
        }
    }

    public int getNumCpus() { return this.cpuCount; }

    public int getNumtareas() {
        return this.tareaCount;
    }

    public Tarea getTareaMaxMemReq() {
        Tarea aux;
        aux = this.tareas[0];
        for (int i = 0; i < this.tareaCount; i++) {
            if (this.tareas[i].getMemReq() > aux.getMemReq()) {
                aux = this.tareas[i];
            }
        }
        return aux;
    }
}

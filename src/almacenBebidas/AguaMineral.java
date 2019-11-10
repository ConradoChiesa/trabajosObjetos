package almacenBebidas;

public class AguaMineral extends Bebida {

    private String manantial;

    public AguaMineral(String manantial, double c, double p, String m) {
        super(c, p, m);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return "AguaMineral{" +
                super.toString() +
                "manantial='" + manantial + '\'' +
                '}';
    }
}

package almacenBebidas;

public class Simulador {
    public static void main(String[] args) {

        Almacen a = new Almacen();
        Bebida b;
        for (int i = 0; i < 10; i++) {
            switch (i%2) {
                case 0:
                    b=new AguaMineral("manantial1",1.5, 5, "bezoya");
                    a.addBebida(b);
                    break;
                case 1:
                    b= new BebidaAzucarada(0.2, true, 1.5, 10, "Coca Cola");
                    a.addBebida(b);
                    break;
            }
        }
        a.mostrarBebida();
        System.out.println(a.calcularPrecioBebidas());
        a.removeBebida(4);
        a.mostrarBebida();
        System.out.println(a.calcularPrecioBebidas());
        System.out.println(a.calcularPrecioBebidas("bezoya"));
        System.out.println(a.calcularPrecioBebidas(0));

    }
}

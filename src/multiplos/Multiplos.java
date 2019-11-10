package multiplos;

import java.util.Iterator;

public class Multiplos implements Iterator<Integer> {

        private int inicio, fin, multiplo, num;

    public Multiplos(int inicio, int fin, int multiplo) {
        this.inicio = inicio;
        this.fin = fin;
        this.multiplo = multiplo;
        this.num = inicio;
        while (inicio<=fin && inicio%multiplo != 0)
            inicio++;
            num = inicio;
    }

    @Override
    public boolean hasNext() {
        return num<=fin;
    }

    @Override
    public Integer next() {
        int nex = num;
        num = num + multiplo;
        return nex;
    }

    public static void main(String[] args) {

        Iterator<Integer> it = new Multiplos(3,15,3);

        while(it.hasNext()){
            Integer iterador = it.next();
            System.out.println("Proximo "+iterador);
        }

    }
}

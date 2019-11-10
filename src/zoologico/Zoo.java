package zoologico;

import zoologico.atributos.AtributoCompuesto;
import zoologico.atributos.AtributoSimple;
import zoologico.atributos.Atributo;
import zoologico.criterios.Mayor;
import zoologico.criterios.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Jaula> jaulas;
    private List<Animal> animales;

    public Zoo() {
        this.jaulas = new ArrayList<>();
        this.animales = new ArrayList<>();
    }

    public void addJaula(Jaula j) { jaulas.add(j); }

    public void addAnimal(Animal a) { animales.add(a); }

    public List<Jaula> getJaulasParaAnimal(Animal a) {
        List<Jaula> aux = new ArrayList<>();
        for (Jaula j :
                jaulas) {
            if (a.puedeHabitar(j))
                aux.add(j);
        }
        return aux;
    }

    public List<Animal> getAnimalesParaJaula(Jaula j) {
        List<Animal> aux = new ArrayList<>();
        for (Animal a :
                animales) {
            if (a.puedeHabitar(j))
                aux.add(a);
        }
        return aux;
    }

    public List<Jaula> getJaulas() {
        return new ArrayList<>(jaulas);
    }

    public List<Animal> getAnimales() {
        return new ArrayList<Animal>(animales);
    }




    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal jirafa = new Animal("Jirafa");
        jirafa.addAtr(Atributo.ALTO, new AtributoSimple(8));
        jirafa.addAtr(Atributo.TIPO, new AtributoSimple("mamifero"));

        /**
         * Para que una jirafa pueda habitar una jaula, las dimensiones tienen que ser mayor a 100 m2, y la altura de la
         * jaula tiene que ser 1 metro mayor a la altura de la jirafa
         */
        Criterio dimensionesJirafa = new Mayor(Atributo.DIMENSIONES, 100);
        Criterio altoMayorJirafa = new Mayor(Atributo.ALTO, (int) jirafa.getAtributo(Atributo.ALTO).getValor() + 1);

        Compuesto criterioJirafa = new Compuesto();
        criterioJirafa.addCriterio(dimensionesJirafa);
        criterioJirafa.addCriterio(altoMayorJirafa);

        jirafa.setCriterio(criterioJirafa);




        Animal mono = new Animal("Mono");
        mono.addAtr(Atributo.ALTO, new AtributoSimple(15));
        mono.addAtr(Atributo.PESO, new AtributoSimple(30));
        mono.addAtr(Atributo.TIPO, new AtributoSimple("mamifero"));

        /**
         * Para que el mono pueda habitar una jaula, ésta debe tener un árbol
         */
        Criterio criterioMono = new Igual(Atributo.TIENE_ARBOL, true);
        mono.setCriterio(criterioMono);


        Animal leon = new Animal("Leon");
        leon.addAtr(Atributo.TIPO, new AtributoSimple("mamifero"));
        leon.addAtr(Atributo.PESO, new AtributoSimple(120.5));
        leon.addAtr(Atributo.NOMBRE_COMPLETO, new AtributoCompuesto(
                        leon.getAtributo(Atributo.NOMBRE),
                        leon.getAtributo(Atributo.TIPO)
                )
        );

        /**
         * Para que un leon pueda habitar una jaula, las dimensiones tienen que ser mayor a 150 m2
         */
        Criterio criterioLeon = new Mayor(Atributo.DIMENSIONES, 150);
        leon.setCriterio(criterioLeon);

        zoo.addAnimal(jirafa);
        zoo.addAnimal(leon);
        zoo.addAnimal(mono);

        Jaula j1 = new Jaula(1001);
        j1.addAtr(Atributo.ALTO, new AtributoSimple(10));
        j1.addAtr(Atributo.ANCHO, new AtributoSimple(10));
        j1.addAtr(Atributo.DIMENSIONES, new AtributoSimple(100));

        Jaula j2 = new Jaula(1002);
        j2.addAtr(Atributo.ALTO, new AtributoSimple(16));
        j2.addAtr(Atributo.ANCHO, new AtributoSimple(50));
        j2.addAtr(Atributo.DIMENSIONES, new AtributoSimple(800));

        Jaula j3 = new Jaula(1003);
        j3.addAtr(Atributo.ALTO, new AtributoSimple(3));
        j3.addAtr(Atributo.ANCHO, new AtributoSimple(10));
        j3.addAtr(Atributo.DIMENSIONES, new AtributoSimple(30));
        j3.addAtr(Atributo.TIENE_ARBOL, new AtributoSimple(true));

        Jaula j4 = new Jaula(1004);
        j4.addAtr(Atributo.ALTO, new AtributoSimple(2));
        j4.addAtr(Atributo.ANCHO, new AtributoSimple(100));
        j4.addAtr(Atributo.DIMENSIONES, new AtributoSimple(200));

        j1.setVecina(j2);
        j3.setVecina(j4);

        zoo.addJaula(j1);
        zoo.addJaula(j2);
        zoo.addJaula(j3);
        zoo.addJaula(j4);

        System.out.println("Los animales existentes en el zoo son:");
        for (Animal a:zoo.getAnimales())
            System.out.println(a);

        System.out.println("Las jaulas existentes en el zoo son:");
        for (Jaula j:zoo.getJaulas())
            System.out.println(j);

        System.out.println();
        System.out.println("Jaulas para el leon:  "+ zoo.getJaulasParaAnimal(leon));
        System.out.println("Jaulas para el mono:  "+ zoo.getJaulasParaAnimal(mono));
        System.out.println("Jaulas para la jirafa: "+ zoo.getJaulasParaAnimal(jirafa));

        System.out.println("Animales para J1: "+ zoo.getAnimalesParaJaula(j1));
        System.out.println("Animales para J2: "+ zoo.getAnimalesParaJaula(j2));
        System.out.println("Animales para J3: "+ zoo.getAnimalesParaJaula(j3));
        System.out.println("Animales para J4: "+ zoo.getAnimalesParaJaula(j4));
    }

}

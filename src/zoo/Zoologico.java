package zoo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import zoo.atributos.Atributo;
import zoo.atributos.AtributoConcatenacion;
import zoo.atributos.AtributoSimple;
import zoo.criterios.Compuesto;
import zoo.criterios.Criterio;
import zoo.criterios.Igual;
import zoo.criterios.Mayor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class Zoologico {
    
    private List<Jaula> jaulas;
    private List<Animal> animales;
    
    public Zoologico(){
        jaulas = new ArrayList<>();
        animales = new ArrayList<>();
    }
    
    public void addJaula(Jaula j){
        this.jaulas.add(j);
    }
    
    public void addAnimal(Animal a){
        this.animales.add(a);
    }
    
    public List<Jaula> jaulasPara(Animal a){
        List<Jaula> jaulas = new ArrayList<>();
        for (Jaula j:this.jaulas){
            if (a.puedeHabitar(j))
                jaulas.add(j);
        }
        return jaulas;
    }
    
    public List<Animal> animalesPara(Jaula j){
        List<Animal> animales = new ArrayList<>();
        for (Animal a:this.animales){
            if (a.puedeHabitar(j))
                animales.add(a);
        }
        return animales;
    }

    public List<Animal> getAnimales(){
        return new ArrayList<Animal>(animales);
    }

    public List<Jaula> getJaulas(){
        return new ArrayList<Jaula>(jaulas);
    }





    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico();

        Animal jirafa = new Animal("Jirafa");
        jirafa.addAtributo(Atributo.ALTO, new AtributoSimple(8));
        jirafa.addAtributo(Atributo.TIPO, new AtributoSimple("mamifero"));

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
        mono.addAtributo(Atributo.ALTO, new AtributoSimple(15));
        mono.addAtributo(Atributo.PESO, new AtributoSimple(30));
        mono.addAtributo(Atributo.TIPO, new AtributoSimple("mamifero"));

        /**
         * Para que el mono pueda habitar una jaula, ésta debe tener un árbol
         */
        Criterio criterioMono = new Igual(Atributo.TIENE_ARBOL, true);
        mono.setCriterio(criterioMono);


        Animal leon = new Animal("Leon");
        leon.addAtributo(Atributo.TIPO, new AtributoSimple("mamifero"));
        leon.addAtributo(Atributo.PESO, new AtributoSimple(120.5));
        leon.addAtributo(Atributo.NOMBRE_COMPLETO, new AtributoConcatenacion(
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
        j1.addAtributo(Atributo.ALTO, new AtributoSimple(10));
        j1.addAtributo(Atributo.ANCHO, new AtributoSimple(10));
        j1.addAtributo(Atributo.DIMENSIONES, new AtributoSimple(100));
        
        Jaula j2 = new Jaula(1002);
        j2.addAtributo(Atributo.ALTO, new AtributoSimple(16));
        j2.addAtributo(Atributo.ANCHO, new AtributoSimple(50));
        j2.addAtributo(Atributo.DIMENSIONES, new AtributoSimple(800));
        
        Jaula j3 = new Jaula(1003);
        j3.addAtributo(Atributo.ALTO, new AtributoSimple(3));
        j3.addAtributo(Atributo.ANCHO, new AtributoSimple(10));
        j3.addAtributo(Atributo.DIMENSIONES, new AtributoSimple(30));
        j3.addAtributo(Atributo.TIENE_ARBOL, new AtributoSimple(true));
        
        Jaula j4 = new Jaula(1004);
        j4.addAtributo(Atributo.ALTO, new AtributoSimple(2));
        j4.addAtributo(Atributo.ANCHO, new AtributoSimple(100));
        j4.addAtributo(Atributo.DIMENSIONES, new AtributoSimple(200));

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
        System.out.println("Jaulas para el leon:  "+ zoo.jaulasPara(leon));
        System.out.println("Jaulas para el mono:  "+ zoo.jaulasPara(mono));
        System.out.println("Jaulas para la jirafa: "+ zoo.jaulasPara(jirafa));
        
        System.out.println("Animales para J1: "+ zoo.animalesPara(j1));
        System.out.println("Animales para J2: "+ zoo.animalesPara(j2));
        System.out.println("Animales para J3: "+ zoo.animalesPara(j3));
        System.out.println("Animales para J4: "+ zoo.animalesPara(j4));
    }
}

package prueba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Simulador {
    public static void main(String[] args) {
        String nombre, direccion;
        int edad;
        double altura;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese int: ");
            nombre = entrada.readLine();
            System.out.println ("Ingrese int: ");
            edad= new Integer(entrada.readLine());
            System.out.println ("Ingrese int: ");
            direccion= entrada.readLine();
            System.out.println ("Ingrese int: ");
            altura= new Double (entrada.readLine());
            System.out.println ("Ingrese double: ");


            System.out.println(nombre+"\n"+direccion +"\n"+edad +"\n"+altura );

        }catch (Exception exc) {
            System.out.println( exc );
            System.out.println("No ingreso un número");
        }
            System.out.println("hasta el infinito y más allá");

    }
}

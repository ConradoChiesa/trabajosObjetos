package navidad;

public class Simulador {
    public static void main(String[] args) {
        Region regionA = new Region();
        Region regionA1 = new Region();
        Region regionA2 = new Region();
        Region regionA3 = new Region();
        Region regionB = new Region();
        Region regionB1 = new Region();
        Region regionB2 = new Region();
        Buzon buzonA = new Buzon();
        Buzon buzonA1 = new Buzon();
        Buzon buzonA2 = new Buzon();
        Buzon buzonA3 = new Buzon();
        Buzon buzonB = new Buzon();
        Buzon buzonB1 = new Buzon();
        Buzon buzonB2 = new Buzon();

        regionA.addLugares(regionA1);
        regionA.addLugares(regionA2);
        regionA.addLugares(regionA3);
        regionB.addLugares(regionB1);
        regionB.addLugares(regionB2);

        regionA.addLugares(buzonA);
        regionA1.addLugares(buzonA1);
        regionA2.addLugares(buzonA2);
        regionA3.addLugares(buzonA3);
        regionB.addLugares(buzonB);
        regionB1.addLugares(buzonB1);
        regionB2.addLugares(buzonB2);

        regionA.addLugares(regionB);
        regionB.addLugares(regionB1);
        regionB.addLugares(regionB2);


        Ninio n01 = new Ninio(1);
        Ninio n02 = new Ninio(2);
        Ninio n03 = new Ninio(3);
        Ninio n04 = new Ninio(4);
        Ninio n05 = new Ninio(5);
        Ninio n06 = new Ninio(6);
        Ninio n07 = new Ninio(7);
        Ninio n08 = new Ninio(8);
        Ninio n09 = new Ninio(9);
        Ninio n10 = new Ninio(10);
        Ninio n11 = new Ninio(11);
        Ninio n12 = new Ninio(12);
        Ninio n13 = new Ninio(13);
        Ninio n14 = new Ninio(14);
        Ninio n15 = new Ninio(15);
        Ninio n16 = new Ninio(16);
        Ninio n17 = new Ninio(17);
        Ninio n18 = new Ninio(18);
        Ninio n19 = new Ninio(19);
        Ninio n20 = new Ninio(20);
        Ninio n21 = new Ninio(21);
        Ninio n22 = new Ninio(22);
        Ninio n23 = new Ninio(23);
        Ninio n24 = new Ninio(24);
        Ninio n25 = new Ninio(25);
        Ninio n26 = new Ninio(26);
        Ninio n27 = new Ninio(27);
        Ninio n28 = new Ninio(28);
        Ninio n29 = new Ninio(29);
        Ninio n30 = new Ninio(30);


        buzonA.addNinio(n01);
        buzonA.addNinio(n02);
        buzonB1.addNinio(n06);
        buzonB1.addNinio(n07);
        buzonB1.addNinio(n08);
        buzonB2.addNinio(n09);

        n01.addRegalo("tren");
        n01.addRegalo("camion");
        n01.escribirCarta();
        n01.deposiarCarta(buzonA);

        n02.addRegalo("tren");
        n02.addRegalo("avion");
        n02.escribirCarta();
        n02.deposiarCarta(buzonA);

        n03.addRegalo("tren");
        n03.addRegalo("avion");
        n03.escribirCarta();
        n03.deposiarCarta(buzonA);

        n04.addRegalo("tren");
        n04.addRegalo("avion");
        n04.escribirCarta();
        n04.deposiarCarta(buzonA);

        n05.addRegalo("auto");
        n05.addRegalo("globo");
        n05.escribirCarta();
        n05.deposiarCarta(buzonA);

        n06.addRegalo("moto");
        n06.addRegalo("globo");
        n06.escribirCarta();
        n06.deposiarCarta(buzonB1);


        n07.addRegalo("moto");
        n07.addRegalo("globo");
        n07.escribirCarta();
        n07.deposiarCarta(buzonB1);

        n08.addRegalo("moto");
        n08.addRegalo("globo");
        n08.escribirCarta();
        n08.deposiarCarta(buzonB1);

        n09.addRegalo("moto");
        n09.addRegalo("globo");
        n09.escribirCarta();
        n09.deposiarCarta(buzonB2);


        System.out.println("REGION A");
        System.out.println("Total de cartas"+regionA.getTotalCartas());
        System.out.println(regionA.getCartasConRegalo("camion"));
        System.out.println(regionA.getNiniosMalos());
        System.out.println(regionA.getPorcentajeCartasConRegalo("avion"));
        System.out.println("Cartas en con trozos de carbon: "+ regionA.getCartasConRegalo("Un trozo de carbón"));
        System.out.println("Total cartas buzonA");
        System.out.println(buzonA.getTotalCartas());
        System.out.println("Total cartas buzonA1");
        System.out.println(buzonA1.getTotalCartas());
        System.out.println("REGION B");
        System.out.println("Total de cartas buzonB1 "+regionB1.getTotalCartas());
        System.out.println(regionB2.getCartasConRegalo("camion"));
        System.out.println(regionB2.getNiniosMalos());
        System.out.println(regionB2.getPorcentajeCartasConRegalo("avion"));
        System.out.println("Cartas en con trozos de carbon: "+ regionB.getCartasConRegalo("Un trozo de carbón"));
    }

}

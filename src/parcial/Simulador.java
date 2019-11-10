package parcial;

import java.util.List;

public class Simulador {
    public static void main(String[] args) {

        Region bsAs = new Region("Buenos Aires");
        Comarca tandil = new Comarca("Tandil", 190000, 5234, 3000000);
        Comarca juarez = new Comarca("Juarez", 14279, 5334, 574345);
        Comarca azul = new Comarca("Azul", 57606, 6615, 45644);
        Comarca olavarria = new Comarca("Olavarria", 111708, 8000, 27467);

        bsAs.addTerritorio(tandil);
        bsAs.addTerritorio(juarez);
        bsAs.addTerritorio(azul);
        bsAs.addTerritorio(olavarria);
        System.out.println(bsAs.getCantHab());
        System.out.println(bsAs.getSup());
        System.out.println(bsAs.getIngPerCapita());
        System.out.println(bsAs.getDensidad());


        CondMayHab mayor100mil = new CondMayHab(100);
        DensidadMay densMay5 = new DensidadMay(5);
        MismoNombre mismoNombre = new MismoNombre("tandil");
        CondicionAnd cond2 = new CondicionAnd(mayor100mil, densMay5);

//        PrintList(bsAs.getComarcasCondicion(mayor100mil));
//        PrintList(bsAs.getComarcasCondicion(densMay5));
        PrintList(bsAs.getComarcasCondicion(mismoNombre));

    }
        private static void PrintList (List<Comarca> lista) {
            for (Comarca c:
                 lista) {

        System.out.println(c.toString());

            }
        }
}

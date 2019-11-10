package sistElectoral;

public class Simulador {

    public static void main(String[] args) {
        Candidato espert = new Candidato("José L. Espert", "Libertad", "Basta de curros");
        Candidato macri = new Candidato("Mauricio Macri", "Cambiemos", "Juntos por el Cambio");
        Candidato fernandez = new Candidato("Alberto Fernandez", "Juntos", "La Campora");

        Sistema sistema = new Sistema();
        sistema.addCandidato(espert);
        sistema.addCandidato(macri);
        sistema.addCandidato(fernandez);
        Votante v01 = new Votante(1);
        Votante v02 = new Votante(2);
        Votante v03 = new Votante(3);
        Votante v04 = new Votante(4);
        Votante v05 = new Votante(5);
        Votante v06 = new Votante(6);
        Votante v07 = new Votante(7);
        Votante v08 = new Votante(8);
        Votante v09 = new Votante(9);
        Votante v10 = new Votante(10);
        Votante v11 = new Votante(11);
        Votante v12 = new Votante(12);
        Votante v13 = new Votante(13);
        Votante v14 = new Votante(14);
        Votante v15 = new Votante(15);

        Mesa m1 = new Mesa("Mesa 001");
        Mesa m2 = new Mesa("Mesa 002");
        Mesa m3 = new Mesa("Mesa 003");
        Mesa m4 = new Mesa("Mesa 004");
        Mesa m5 = new Mesa("Mesa 005");

        m1.addVotante(v01);
        m1.addVotante(v02);
        m1.addVotante(v03);
        m2.addVotante(v04);
        m2.addVotante(v05);
        m2.addVotante(v06);
        m3.addVotante(v07);
        m3.addVotante(v08);
        m3.addVotante(v09);
        m4.addVotante(v10);
        m4.addVotante(v11);
        m4.addVotante(v12);
        m5.addVotante(v13);
        m5.addVotante(v14);
        m5.addVotante(v15);

        m1.addCandidato(espert);
        m1.addCandidato(macri);
        m1.addCandidato(fernandez);


        LugarDeVotacion tandil = new LugarDeVotacion("Tandil");
        tandil.addMesa(m1);
        tandil.addMesa(m2);
        tandil.addMesa(m3);
        tandil.addMesa(m4);
        tandil.addMesa(m5);


        v01.emitirVoto(espert, m1);
        v02.emitirVoto(espert, m1);
        v03.emitirVoto(macri, m1);
        v04.emitirVoto(fernandez, m2);
        v05.emitirVoto(espert, m2);
        v06.emitirVoto(macri, m2);
        v07.emitirVoto(macri, m3);
        v08.emitirVoto(espert, m3);
        v09.emitirVoto(macri, m3);
        v10.emitirVoto(fernandez, m4);
        v11.emitirVoto(espert, m4);
        v12.emitirVoto(fernandez, m4);
        v13.emitirVoto(espert, m5);
        v14.emitirVoto(macri, m5);
        v15.emitirVoto(espert, m5);



        System.out.println(m1.getCantVotos());
        System.out.println(tandil.getPorcentajeVotos(espert));
    }
}

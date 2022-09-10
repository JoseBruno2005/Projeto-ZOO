package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Ambiente ambienteAguatico = new Ambiente(1);
        Ambiente ambienteTerrestre = new Ambiente(1);
        Ambiente ambienteAerio = new Ambiente(1);

        Baleia baleaazul = new Baleia(
                true,
                true,
                "Mobidique",
                "Mamifero marinho",
                "Canivoro",
                34,
                90,
                true,
                false,
                false,
                false,
                0
        );
        ambienteAguatico.setListadeanimais(0,baleaazul);

        Macaco micoleao = new Macaco(
                true,
                true,
                "Rei Macaco",
                "Leontopithecus rosalia",
                "Onivero",
                15,
                22,
                true,
                false,
                true,
                false,
                4
        );
        ambienteTerrestre.setListadeanimais(0,micoleao);

        Papagaio papagaio = new Papagaio(
                true,
                true,
                "Meiras",
                "Amazona aestiva",
                "herbivoro",
                15,
                15,
                true,
                false,
                false,
                false,
                2
        );
        ambienteAerio.setListadeanimais(0,papagaio);

        Zoologico zoologico = new Zoologico(
                "ZooPOO",
                ambienteTerrestre,
                ambienteAguatico,
                ambienteAerio
        );
        System.out.println("-=-=-=-=-=");
        System.out.println(zoologico.getNome());
        System.out.println("-=-=-=-=-=\n");
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Ambiente Terrestre: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(zoologico.getAmbiente());
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Ambiente Aguatico: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(zoologico.getAmbiente2());
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Ambiente Aerio: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(zoologico.getAmbiente3());

    }
}


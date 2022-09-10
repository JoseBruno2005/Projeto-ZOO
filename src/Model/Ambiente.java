package Model;

import java.util.Arrays;

public class Ambiente {

    Animal[] listadeanimais;

    public Ambiente(int totaldeanimais){
        listadeanimais = new Animal[totaldeanimais];
    }

    public void getListadeanimais() {
        for(int i = 0; i<this.listadeanimais.length; i++){
            System.out.println(listadeanimais[i]);
        }
    }

    public void setListadeanimais(int posicao , Animal Animal) {
        this.listadeanimais[posicao] = Animal;
    }

    @Override
    public String toString() {
        this.getListadeanimais();
        return "";
    }
}


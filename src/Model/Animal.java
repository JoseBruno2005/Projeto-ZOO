package Model;

public class Animal {
    public Animal(

            String nomedoanimal,
            String especie,
            String tipodealimentacao,
            int idade,
            float estimativadeVida,
            boolean temRabo,
            boolean temChifre,
            boolean temPelos,
            boolean temEscama,
            int quantPatas
    ){
        this.nomeDoAnimal = nomedoanimal;
        this.especie = especie;
        this.tipodeAlimentacao = tipodealimentacao;
        this.idade = idade;
        this.estimativadeVida = estimativadeVida;
        this.temRabo = temRabo;
        this.temChifre = temChifre;
        this.temPelos = temPelos;
        this.temEscama = temEscama;
        this.quantPatas = quantPatas;
    }



    float estimativadeVida = 0;
    boolean temRabo = false;
    boolean temChifre = false;
    boolean temPelos = false;
    boolean temEscama = false;
    int quantPatas = 0;
    String nomeDoAnimal = "";
    String especie = "";
    String tipodeAlimentacao = "";
    int idade = 0;



    public float getEstimativadeVida() {
        return estimativadeVida;
    }
    public int getQuantPatas() {
        return quantPatas;
    }

    public boolean isTemRabo() {
        return temRabo;
    }

    public boolean isTemChifre() {
        return temChifre;
    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public boolean isTemEscama() {
        return temEscama;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipodeAlimentacao() {
        return tipodeAlimentacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setEstimativadeVida(float estimativadeVida) {
        estimativadeVida = estimativadeVida;
    }
    public void setTemRabo(boolean temRabo) {
        temRabo = temRabo;
    }
    public void setTemChifre(boolean temChifre) {
        temChifre = temChifre;
    }
    public void setTemPelos(boolean temPelos) {
        temPelos = temPelos;
    }
    public void setTemEscama(boolean temEscama) {
        temEscama = temEscama;
    }
    public void setQuantPatas(int quantPatas) {
        quantPatas = quantPatas;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipodeAlimentacao(String tipodeAlimentacao) {
        this.tipodeAlimentacao = tipodeAlimentacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nEstimativa de vida = " + estimativadeVida + "\nTem Rabo = " + temRabo +
                "\nTem Chifre = "+ temChifre +"\nTem Pelos = "+ temPelos + "\nTem Escama = " + temEscama +
                "\nQuantidade De Patas = " + quantPatas + "\nNome = " + nomeDoAnimal +
                "\nEspecie = " + especie + "\nTipo De Alimentacao = " + tipodeAlimentacao +
                "\nIdade Do Animal = " + idade;
    };

}


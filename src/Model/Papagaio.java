package Model;

public class Papagaio extends Animal{

    public Papagaio(
            boolean voa,
            boolean conseguifalar,
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
        super(nomedoanimal, especie, tipodealimentacao, idade,
                estimativadeVida, temRabo, temChifre,
                temPelos, temEscama, quantPatas);
        this.conseguifalar = conseguifalar;
        this.voa = voa;
    }
    boolean voa = false;
    boolean conseguifalar = false;

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public boolean isConseguifalar() {
        return conseguifalar;
    }

    public void setConseguifalar(boolean conseguifalar) {
        this.conseguifalar = conseguifalar;
    }

    Papagaio(String nomedoanimal, String especie, String tipodealimentacao, int idade, float estimativadeVida, boolean temRabo, boolean temChifre, boolean temPelos, boolean temEscama, int quantPatas) {
        super(nomedoanimal, especie, tipodealimentacao, idade, estimativadeVida, temRabo, temChifre, temPelos, temEscama, quantPatas);
    }

    @Override
    public float getEstimativadeVida() {
        return super.getEstimativadeVida();
    }

    @Override
    public int getQuantPatas() {
        return super.getQuantPatas();
    }

    @Override
    public boolean isTemRabo() {
        return super.isTemRabo();
    }

    @Override
    public boolean isTemChifre() {
        return super.isTemChifre();
    }

    @Override
    public boolean isTemPelos() {
        return super.isTemPelos();
    }

    @Override
    public boolean isTemEscama() {
        return super.isTemEscama();
    }

    @Override
    public String getNomeDoAnimal() {
        return super.getNomeDoAnimal();
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public String getTipodeAlimentacao() {
        return super.getTipodeAlimentacao();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setEstimativadeVida(float estimativadeVida) {
        super.setEstimativadeVida(estimativadeVida);
    }

    @Override
    public void setTemRabo(boolean temRabo) {
        super.setTemRabo(temRabo);
    }

    @Override
    public void setTemChifre(boolean temChifre) {
        super.setTemChifre(temChifre);
    }

    @Override
    public void setTemPelos(boolean temPelos) {
        super.setTemPelos(temPelos);
    }

    @Override
    public void setTemEscama(boolean temEscama) {
        super.setTemEscama(temEscama);
    }

    @Override
    public void setQuantPatas(int quantPatas) {
        super.setQuantPatas(quantPatas);
    }

    @Override
    public void setNomeDoAnimal(String nomeDoAnimal) {
        super.setNomeDoAnimal(nomeDoAnimal);
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public void setTipodeAlimentacao(String tipodeAlimentacao) {
        super.setTipodeAlimentacao(tipodeAlimentacao);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String toString() {
        return "Papagaio: " +
                "\nVoa = " + voa +
                "\nConsegui Falar = " + conseguifalar +
                super.toString();
    }
}

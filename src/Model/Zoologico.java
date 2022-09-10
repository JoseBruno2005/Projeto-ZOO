package Model;

public class Zoologico {

    String nome;
    Ambiente ambiente;
    Ambiente ambiente2;
    Ambiente ambiente3;

    public Zoologico(String nome, Ambiente ambiente, Ambiente ambiente2, Ambiente ambiente3){
        this.nome = nome;
        this.ambiente = ambiente;
        this.ambiente2 = ambiente2;
        this.ambiente3 = ambiente3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Ambiente getAmbiente2() {
        return ambiente2;
    }

    public void setAmbiente2(Ambiente ambiente2) {
        this.ambiente2 = ambiente2;
    }

    public Ambiente getAmbiente3() {
        return ambiente3;
    }

    public void setAmbiente3(Ambiente ambiente3) {
        this.ambiente3 = ambiente3;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", ambiente=" + ambiente +
                ", ambiente2=" + ambiente2 +
                ", ambiente3=" + ambiente3 +
                '}';
    }
}

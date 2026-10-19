package fundamentos.polimorfismo;

public class Pessoa {
    private String nome;
    private Double peso;

    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    /*
    public void comer (Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comer (Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comer (Carne carne){
        this.peso += carne.getPeso();
    }
    */
    public void comer (Comida comida){
        this.peso += comida.getPeso();
    }
}

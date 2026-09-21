
package fundamentos.Listas;


public class Produto {
    private String nome;
    private Double valor;
    private Double desconto;

    public Produto() {
    }

    public Produto(String nome, Double valor, Double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
    
}

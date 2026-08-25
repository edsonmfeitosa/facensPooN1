
package fundamentos;


public class Pessoa {
    private String nome;
    public String corDosOlhos;
    
    public void DarNome(String nome){
        this.nome = nome;
    }
    public String perguntarONome(Pessoa pessoa){
        String resposta = "Qual o seu nome?\n";
        resposta += pessoa.responderONome();
        return resposta;
    }
    public String responderONome(){
        return "Meu nome é"+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }
}

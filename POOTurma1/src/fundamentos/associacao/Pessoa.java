
package fundamentos.associacao;

import java.util.ArrayList;


public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Automovel> automoveis =
            new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
    public void setAutomovel(Automovel automovel){
        automoveis.add(automovel);
        automovel.setDono(this);
    }
}

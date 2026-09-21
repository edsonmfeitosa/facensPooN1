
package fundamentos.lista02;

import java.util.Objects;

public class Aluno {
    private String ra;
    private String nome;

    public Aluno() {
    }

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String imprimir(){
        return "Nome: "+this.nome +
                "\nRA: " + this.ra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.ra);
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.ra, other.ra)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
}

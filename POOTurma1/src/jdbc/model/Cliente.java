
package jdbc.model;

public class Cliente {
    private int cod_cliente;
    private String nome;
    private String telefone;
    private String rg;
    private String cpf;
    private String email;
    private String sexo;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String rg, String cpf, String email, String sexo, String endereco, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cliente=" + cod_cliente + ", nome=" + nome + ", telefone=" + telefone + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", sexo=" + sexo + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
    
}

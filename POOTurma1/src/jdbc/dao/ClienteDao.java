
package jdbc.dao;
import java.sql.*;
import java.util.ArrayList;
import jdbc.factory.ConnectionFactory;
import jdbc.model.Cliente;

public class ClienteDao {
    private Connection conexao;
    
    public ClienteDao(){
        //this.conexao = new ConnectionFactory().getConnection();
        ConnectionFactory cf = new ConnectionFactory();
        this.conexao = cf.getConnection();
    }
    public ArrayList<Cliente> consultar(){
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            String query = "select * from cliente";
            PreparedStatement comando = conexao.prepareStatement(query);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {                
                Cliente cli = new Cliente();
                cli.setCod_cliente(resultado.getInt("cod_cliente"));
                cli.setNome(resultado.getString("nome"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setRg(resultado.getString("rg"));
                cli.setCpf(resultado.getString("cpf"));
                cli.setEmail(resultado.getString("email"));
                cli.setSexo(resultado.getString("sexo"));
                cli.setEndereco(resultado.getString("endereco"));
                cli.setBairro(resultado.getString("bairro"));
                cli.setCidade(resultado.getString("cidade"));
                cli.setEstado(resultado.getString("estado"));
                lista.add(cli);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }
    }
    
    public Cliente consultar(int id){
        try {
            String query = "select * from cliente where cod_cliente = ?";
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            Cliente cli = new Cliente();
            while (resultado.next()) {                
                cli.setCod_cliente(resultado.getInt("cod_cliente"));
                cli.setNome(resultado.getString("nome"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setRg(resultado.getString("rg"));
                cli.setCpf(resultado.getString("cpf"));
                cli.setEmail(resultado.getString("email"));
                cli.setSexo(resultado.getString("sexo"));
                cli.setEndereco(resultado.getString("endereco"));
                cli.setBairro(resultado.getString("bairro"));
                cli.setCidade(resultado.getString("cidade"));
                cli.setEstado(resultado.getString("estado"));
                
            }
            return cli;
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }
    }
    public Cliente cadastrar(Cliente cliente){
        String query = "insert into cliente (nome, telefone, rg, cpf, email, sexo, endereco, bairro, cidade, estado)\n" +
                        " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement comando = conexao.prepareStatement(query,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getTelefone());
            comando.setString(3, cliente.getRg());
            comando.setString(4, cliente.getCpf());
            comando.setString(5, cliente.getEmail());
            comando.setString(6, cliente.getSexo());
            comando.setString(7, cliente.getEndereco());
            comando.setString(8, cliente.getBairro());
            comando.setString(9, cliente.getCidade());
            comando.setString(10, cliente.getEstado());
            comando.executeUpdate();
            ResultSet resultado = comando.getGeneratedKeys();
            if (resultado.next()) {
                cliente.setCod_cliente(resultado.getInt(1));
            }
            return cliente;
        }
        catch(SQLException erro){
            throw new RuntimeException(erro.getMessage());
        }
    }
    
    public boolean alterar(Cliente cliente, int id){
        String query = "update cliente set nome = ?, telefone = ?, rg = ?, \n" +
                        " cpf = ?, email = ?, sexo = ?, endereco = ?, \n" +
                        " bairro = ?, cidade = ?, estado = ? \n" +
                        " where cod_cliente = ?";
        try{
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getTelefone());
            comando.setString(3, cliente.getRg());
            comando.setString(4, cliente.getCpf());
            comando.setString(5, cliente.getEmail());
            comando.setString(6, cliente.getSexo());
            comando.setString(7, cliente.getEndereco());
            comando.setString(8, cliente.getBairro());
            comando.setString(9, cliente.getCidade());
            comando.setString(10, cliente.getEstado());
            comando.setInt(11, id);
            if (comando.executeUpdate() > 1) {
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException erro){
            throw new RuntimeException(erro.getMessage());
        }
    }
    
    public boolean excluir(int id){
        String query = "delete\n" +
                        " from cliente\n" +
                        " where cod_cliente = ?";
        try{
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setInt(1, id);
            if (comando.executeUpdate() > 1) {
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException erro){
            throw new RuntimeException(erro.getMessage());
        }
    }
    
}

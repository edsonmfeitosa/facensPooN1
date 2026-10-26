
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
    
    
}

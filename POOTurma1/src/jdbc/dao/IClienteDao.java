
package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;

public interface IClienteDao {
    public ArrayList<Cliente> consultar();
    public Cliente consultar(int id);
    public Cliente cadastrar(Cliente cliente);
    public boolean alterar(Cliente cliente, int id);
    public boolean excluir(int id);
    
}


package jdbc.service;

import java.util.ArrayList;
import jdbc.dao.IClienteDao;
import jdbc.model.Cliente;

public class ClienteService {
    private IClienteDao cliDao;
    
    public ClienteService(IClienteDao cliDao){
        this.cliDao = cliDao;
    }
    public ArrayList<Cliente> consultar(){
        return cliDao.consultar();
    }
    public Cliente consultar(int id){
        return cliDao.consultar(id);
    }
    public Cliente cadastrar(Cliente cliente){
        return cliDao.cadastrar(cliente);
    }
    public boolean excluir(int id){
        return cliDao.excluir(id);
    }
    public boolean alterar(Cliente cliente, int id){
        return cliDao.alterar(cliente, id);
    }
    
}


package jdbc.main;

import jdbc.factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import jdbc.dao.ClienteDao;
import jdbc.dao.ClienteTeste;
import jdbc.model.Cliente;
import jdbc.service.ClienteService;

public class AulaBd {
    public static void main(String[] args) {
        /*
        ConnectionFactory conn = new ConnectionFactory();
        Connection c = conn.getConnectionPortable();
        System.out.println("Funcionou!");
        */
        ClienteDao cDao = new ClienteDao();
        /*
        ArrayList<Cliente> clientes = cDao.consultar();
        
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
        */
        //System.out.println(cDao.consultar(3));
        //Cliente c = new Cliente("Marcelo", "123321", "22113", "222333444", "marcelo@gmail.com", "M", "rua do mar", "marezia", "São Roque", "SP");
        //cDao.cadastrar(c);
        //cDao.excluir(14);
        
        //Exemplo de troca de IClienteDao para uma classe de teste
        ClienteTeste cTeste = new ClienteTeste();
        ClienteService cServ = new ClienteService(cTeste);
    }
}


package jdbc.main;

import jdbc.factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import jdbc.dao.ClienteDao;
import jdbc.model.Cliente;

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
        cDao.excluir(14);
    }
}

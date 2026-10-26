
package jdbc.factory;
import java.sql.*;

public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            var conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vendased?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC", "root", "MATRIX");
            return conn;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    public Connection getConnectionPortable(){
        try {
            var conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/vendased?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC", "root", "usbw");
            return conn;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

}

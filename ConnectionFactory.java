//classe onde sera iniciado a coneçao com o BD
package br.com.testecrud.infra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection()  {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/discentedb","root","2916000");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

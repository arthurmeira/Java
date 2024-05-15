package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection
            (
                    String enderecoIp,
                    String enderecoPorta,
                    String nomeBanco,
                    String usuarioBanco,
                    String senhaBanco
            ) throws SQLException
    {
        return DriverManager.getConnection
                (
                        "jdbc:mysql://"+enderecoIp+":"+enderecoPorta+"/"+nomeBanco,
                        usuarioBanco,
                        senhaBanco
                );
    }

}

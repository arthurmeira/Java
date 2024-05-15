import database.ConnectionFactory;
import database.dao.ClienteDAO;
import database.model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class TesteBanco {
    public static void main(String[] args) throws SQLException {
        Connection conexao = ConnectionFactory.getConnection(
                "localhost",
                "3306",
                "minhaUnesc",
                "root",
                "root"
        );

        if (conexao != null){
            System.out.println("Conectou!");
            ClienteDAO d = new ClienteDAO(conexao);
            d.selectAll();
            ArrayList<Cliente> lista = d.selectAll();
            System.out.println(lista);
            } else {
                System.out.printf("Deu pau!");
            }
    }
}
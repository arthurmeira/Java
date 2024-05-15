package database.dao;

import database.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    private String select = "SELECT * FROM minhaUnesc.tb_cliente";
    private PreparedStatement pstSelect;

    public ClienteDAO(Connection conexao) throws SQLException {
        pstSelect = conexao.prepareStatement(select);
    }

    public ArrayList<Cliente> selectAll() throws SQLException {
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        try (ResultSet resultado = pstSelect.executeQuery()) {
            while (resultado.next()) {
                Cliente c = new Cliente();
                c.setId(resultado.getInt("id"));
                c.setNm_cliente(resultado.getString("nm_cliente"));
                c.setCpf(resultado.getString("cpf"));
                listaCliente.add(c);
            }
        }

        return listaCliente;
    }
}

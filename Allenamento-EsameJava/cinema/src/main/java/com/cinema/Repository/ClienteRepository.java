package com.cinema.Repository;

import com.cinema.Models.Cliente;
import com.cinema.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    public static List<Cliente> getAllCliente() throws SQLException {
        List<Cliente> clienteList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM CLIENTE";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente (
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("email"),
                        rs.getString("telefono")
                );
                clienteList.add(cliente);
            }
        }
        catch (SQLException ex){
            System.out.printf(ex.getMessage());
        }
        finally {
            if (conn !=null)
                conn.close();
            if (comando !=null)
                comando.close();
        }
        return clienteList;
    }
}
package com.spedizioni.repository;

import com.spedizioni.constants.DBConfig;
import com.spedizioni.model.Ordine;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdineRepository {
    public static List<Ordine> getAllOrdine() throws SQLException {
        List<Ordine> ordineList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PWD);
            String query = "SELECT * FROM ORDINE";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Ordine ordine = new Ordine (
                        rs.getLong("id"),
                        rs.getInt("numero"),
                        rs.getDate("data")
                );
                ordineList.add(ordine);
            } // while
        } // try
        catch (SQLException ex){
            System.out.printf(ex.getMessage());
        } // catch
        finally {
            if (conn !=null)
                conn.close();
            if (comando !=null)
                comando.close();
        } // finally
        return ordineList;
    } // list
} // class

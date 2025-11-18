package com.spedizioni.repository;

import com.spedizioni.model.Articolo;
import com.spedizioni.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticoloRepository {
    public static List<Articolo> getAllArticolo() throws SQLException {
        List<Articolo> articoloList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PWD);
            String query = "SELECT * FROM ARTICOLO";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Articolo articolo = new Articolo (
                        rs.getLong("id"),
                        rs.getString("codice"),
                        rs.getString("descrizione"),
                        rs.getFloat("peso")
                );
                articoloList.add(articolo);
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
        return articoloList;
    } // list
} // class

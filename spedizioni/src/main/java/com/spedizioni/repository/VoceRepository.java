package com.spedizioni.repository;

import com.spedizioni.constants.DBConfig;
import com.spedizioni.model.Voce;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VoceRepository {
    public static List<Voce> getAllVoce() throws SQLException {
        List<Voce> voceList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PWD);
            String query = "SELECT * FROM VOCE";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Voce voce = new Voce (
                        rs.getLong("id"),
                        rs.getLong("ordine_id"),
                        rs.getLong("articolo_id"),
                        rs.getInt("quantita")
                );
                voceList.add(voce);
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
        return voceList;
    } // list
} // class

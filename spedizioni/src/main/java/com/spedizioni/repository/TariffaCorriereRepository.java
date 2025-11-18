package com.spedizioni.repository;

import com.spedizioni.constants.DBConfig;
import com.spedizioni.model.TariffaCorriere;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TariffaCorriereRepository {
    public static List<TariffaCorriere> getAllTariffaCorriere() throws SQLException {
        List<TariffaCorriere> tariffaCorriereList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PWD);
            String query = "SELECT * FROM TARIFFA_CORRIERE";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                TariffaCorriere tariffaCorriere = new TariffaCorriere (
                        rs.getLong("id"),
                        rs.getString("nome_corriere"),
                        rs.getString("nome_tariffa"),
                        rs.getFloat("peso_massimo"),
                        rs.getFloat("costo")
                );
                tariffaCorriereList.add(tariffaCorriere);
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
        return tariffaCorriereList;
    } // list
}

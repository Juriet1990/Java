package com.cinema.Repository;

import com.cinema.Models.Film;
import com.cinema.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmRepository {

    public static List<Film> getAllFilm() throws SQLException {
        List<Film> filmList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM FILM";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Film film = new Film (
                    rs.getLong("id"),
                    rs.getString("regista"),
                    rs.getInt("durata_minuti"),
                    rs.getString("genere"),
                    rs.getInt("anno_uscita")
                );
                filmList.add(film);
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
        return filmList;
    }
}
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
        catch (SQLException ex) {
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

// Come fare una repository
package com.cinema.repository; // tutto minuscolo!

import com.cinema.Models.NomeTabella; // gli import dovrebbero comparire man mano che scrivi
import com.cinema.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NomeRepository {

        public static List<NomeTabella> getAllNomeTabella() throws SQLException {
            List<NomeTabella> nomeTabellaList = new ArrayList<>();
            Connection conn = null;
            PreparedStatement comando = null;
            try {
                conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PWD); (se non configuri DBConfig, questo punto sarà sempre in rosso!)
                String query = "SELECT * FROM NOMETABELLA";
                comando = conn.prepareStatement(query);
                ResultSet rs = comando.executeQuery();
                while (rs.next()) {
                    NomeTabella nomeTabella = new NomeTabella (
                        rs.getTipoVariabile("NomeColonna"),
                        rs.getTipoVariabile("NomeColonna")
                    );
                    nomeTabellaList.add(nomeTabella);
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
            return nomeTabellaList;
        }
    }

// Esercizi
public class FilmRepository {
    public static List<Film> getAllFilm() throws SQLException {
        List<Film> filmList = ArrayList<>();
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
        catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
        finally {
            if (conn != null)
            conn.close();
            if (comando != null)
            comando.close();
        }
        return filmList;
    }
}

public class FilmRepository {
    public static List<Film> getAllFilm() throws SQLException {
        List<Film> filmList = ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM FILM";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Film film = new film (
                    rs.getLong("id"),
                    rs.getString("regista"),
                    rs.getInt("durata_minuti"),
                    rs.getString("genere"),
                    rs.getInt("anno_uscita")
                );
                filmList.add(film);
            }
        }
        catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
        finally {
            if (conn != null)
            conn.close();
            if (comando != null)
            comando.close();
        }
        return filmList;
    }
}

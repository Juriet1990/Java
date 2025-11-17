package com.cinema.Controller;

import com.cinema.Models.Film;
import com.cinema.Repository.FilmRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping ("api/film/")
public class FilmController {
    @GetMapping ("getFilm")
    public List<Film> getAllFilms() throws SQLException {
        List<Film> listaFilm = FilmRepository.getAllFilm();
        return listaFilm;
    }
}

// Come fare un controller:
package com.nomedb.controller;

import com.nomedb.models.NomeTabella; // questi due sono il percorso
import com.nomedb.repository.NomeTabellaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("api/nometabella/")
public class NomeTabellaController {
    @GetMapping("getNomeTabella")
    public List<NomeTabella> getAllNomeTabella() throws SQLException {
        List<NomeTabella> listaNomeTabella = NomeTabellaRepository.getAllNomeTabella();
        return listaNomeTabella;
    }
}

// Esercizi
@RestController
@RequestMapping("api/film/")
public class FilmController {
    @GetMapping("getFilm")
    public List<Film> getAllFilm() throws SQLException {
        List<filmList> listaFilm = FilmRepository.getAllFilm();
        return listaFilm;
    }
}

@RestController
@RequestMapping("api/film/")
public class FilmController {
    @GetMapping("getFilm")
    public List<Film> getAllFilm() throws SQLException {
        List<filmList> listaFilm = FilmRepository.getAllFilm();
        return listaFilm;
    }
}
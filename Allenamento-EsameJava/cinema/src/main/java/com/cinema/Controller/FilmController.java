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
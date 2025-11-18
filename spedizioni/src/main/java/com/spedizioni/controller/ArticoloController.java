package com.spedizioni.controller;

import com.spedizioni.model.Articolo;
import com.spedizioni.repository.ArticoloRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping ("api/articolo/")
public class ArticoloController {
    @GetMapping("getArticolo")
    public List<Articolo> getAllArticolo() throws SQLException {
        List<Articolo> listaArticolo = ArticoloRepository.getAllArticolo();
        return listaArticolo;
    } // list
} // class

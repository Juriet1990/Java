package com.spedizioni.controller;

import com.spedizioni.model.Ordine;
import com.spedizioni.repository.OrdineRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping ("api/ordine/")
public class OrdineController {
    @GetMapping("getOrdine")
    public List<Ordine> getAllOrdine() throws SQLException {
        List<Ordine> listaOrdine = OrdineRepository.getAllOrdine();
        return listaOrdine;
    } // list
} // class

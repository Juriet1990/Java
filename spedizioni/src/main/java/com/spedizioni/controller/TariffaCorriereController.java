package com.spedizioni.controller;

import com.spedizioni.model.TariffaCorriere;
import com.spedizioni.repository.TariffaCorriereRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/tariffa_corriere/")
public class TariffaCorriereController {
    @GetMapping("getTariffaCorriere")
    public List<TariffaCorriere> getAllTariffaCorriere() throws SQLException {
        List<TariffaCorriere> listaTariffaCorriere = TariffaCorriereRepository.getAllTariffaCorriere();
        return listaTariffaCorriere;
    } // list
} // class

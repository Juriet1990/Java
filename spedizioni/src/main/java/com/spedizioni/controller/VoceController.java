package com.spedizioni.controller;

import com.spedizioni.model.Voce;
import com.spedizioni.repository.VoceRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping ("api/voce/")
public class VoceController {
    @GetMapping("getVoce")
    public List<Voce> getAllVoce() throws SQLException {
        List<Voce> listaVoce = VoceRepository.getAllVoce();
        return listaVoce;
    } // list
} // class

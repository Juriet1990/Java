package com.cinema.Controller;

import com.cinema.Models.Cliente;
import com.cinema.Repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("api/cliente/")
public class ClienteController {
    @GetMapping("getCliente")
    public List<Cliente> getAllCliente() throws SQLException {
        List<Cliente> listaCliente = ClienteRepository.getAllCliente();
        return listaCliente;
    }
}
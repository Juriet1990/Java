package com.cinema.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sala implements Serializable {
    private Long id;
    private String nome;
    private int capienza;
    private String tipoSala;
}

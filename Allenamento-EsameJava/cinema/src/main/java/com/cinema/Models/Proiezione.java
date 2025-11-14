package com.cinema.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proiezione implements Serializable {
    private Long id;
    private Long filmId;
    private Long salaId;
    private LocalDateTime dataOra;
    private double prezzoBiglietto;
    private int postiDisponibili;
}

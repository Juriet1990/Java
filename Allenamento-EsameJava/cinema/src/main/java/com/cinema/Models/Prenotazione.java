package com.cinema.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prenotazione implements Serializable {
    private Long id;
    private Long clienteId;
    private Long proiezioneId;
    private int numeroPosti;
    private LocalDateTime dataPrenotazione;
    private double totale;
    private String stato;
}

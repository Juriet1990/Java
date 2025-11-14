package com.cinema.Models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente implements Serializable {
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
}

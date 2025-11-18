package com.spedizioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voce implements Serializable {
    private Long id;
    private Long ordineId;
    private Long articoloId;
    private int quantita;
} // class

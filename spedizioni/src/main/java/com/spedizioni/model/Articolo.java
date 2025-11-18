package com.spedizioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Articolo implements Serializable {
    private Long id;
    private String codice;
    private String descrizione;
    private Float peso;
} // class

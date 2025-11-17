package com.cinema.models

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Film implements Serializable {
    private Long id;
    private String regista;
    private int durataMinuti;
    private String genere;
    private int annoUscita;
}

// Come fare un model package (nome del package minuscolo, nome del file java maiuscolo)
import lombok.*; // * = vuol dire "tutto", raggruppa tutte le dipendenze di Lombok
// gli altri import li mette in automatico man mano che scrivi, se no fai import class sulla parola in rosso
@AllArgsConstructor
@NoArgsConstructor
@Data 
public class NomeTabellaDelDB implements Serializable {
    private tipoVariabile nomeVariabile;
}
// non serve fare getter e setter perché c'è già Lombok in questo caso

// Esercizi
public class Film implements Serializable {
    private Long id;
    private String regista;
    private int durataMinuti;
    private String genere;
    private int annoUscita;
}

public class Film implements Serializable {
    private Long id;
    private String regista;
    private int durataMinuti;
    private String genere;
    private int annoUscita;
}

public class Film implements Serializable {
    private Long id;
    private String regista;
    private int durataMinuti;
    private String genere;
    private int annoUscita;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Film implements Serializable {
    private Long id;
    private String regista;
    private int durataMinuti;
    private String genere;
    private int annoUscita;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Film implements Serializable {
    private Long id;
    private String regista;
    private int durataMinuti;
    private String genere;
    private int annoUscita;
}


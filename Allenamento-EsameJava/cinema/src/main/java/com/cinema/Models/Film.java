package com.cinema.Models;

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

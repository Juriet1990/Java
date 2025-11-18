package com.spedizioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ordine implements Serializable {
    private Long id;
    private int numero;
    private Date data;
} // class

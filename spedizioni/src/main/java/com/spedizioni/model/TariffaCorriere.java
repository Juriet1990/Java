package com.spedizioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TariffaCorriere implements Serializable {
    private Long id;
    private String nomeCorriere;
    private String nomeTariffa;
    private Float pesoMassimo;
    private Float costo;
}

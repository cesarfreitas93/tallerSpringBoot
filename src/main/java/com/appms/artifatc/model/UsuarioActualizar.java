package com.appms.artifatc.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UsuarioActualizar {
    private Integer id;
    private String nombre;
    private BigDecimal saldo;
}

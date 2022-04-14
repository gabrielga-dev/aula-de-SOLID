package br.com.solid.aula.openclosedprinciple.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CashierDTO {
    private Long id;
    private Integer number;
    private String descricao;
    private boolean isQuickCashier;
}


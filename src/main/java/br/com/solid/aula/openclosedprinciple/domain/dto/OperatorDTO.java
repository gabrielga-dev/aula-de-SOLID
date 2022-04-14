package br.com.solid.aula.openclosedprinciple.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperatorDTO {
    private Long id;
    private String name;
    private boolean ableToMakeSale;
}



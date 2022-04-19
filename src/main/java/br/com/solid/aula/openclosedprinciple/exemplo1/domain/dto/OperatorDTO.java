package br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperatorDTO {
    private Long id;
    private String name;
    private boolean ableToMakeSale;
}



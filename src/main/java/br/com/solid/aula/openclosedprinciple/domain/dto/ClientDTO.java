package br.com.solid.aula.openclosedprinciple.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private Long id;
    private String name;
    private boolean isPrime;
}



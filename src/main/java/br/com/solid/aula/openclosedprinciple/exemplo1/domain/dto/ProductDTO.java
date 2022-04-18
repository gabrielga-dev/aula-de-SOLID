package br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private BigDecimal price;
}



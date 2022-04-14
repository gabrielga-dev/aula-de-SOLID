package br.com.solid.aula.openclosedprinciple.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductTransactionDTO {
    private BigDecimal quantity;
    private ProductDTO product;
}


package br.com.solid.aula.openclosedprinciple.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class TransactionDTO {
    private Long id;
    private BigDecimal rawValue;
    private BigDecimal discountValue;
    private BigDecimal finalValue;

    private OperatorDTO operator;
    private ClientDTO client;
    private CashierDTO cashier;

    private List<ProductTransactionDTO> items;
}


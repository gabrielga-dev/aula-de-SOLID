package br.com.solid.aula.openclosedprinciple.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;

public interface TransactionValidation {
    boolean isValid(TransactionDTO transaction);
}

package br.com.solid.aula.openclosedprinciple.exemplo1.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto.TransactionDTO;

public interface TransactionValidation {
    boolean isValid(TransactionDTO transaction);
}

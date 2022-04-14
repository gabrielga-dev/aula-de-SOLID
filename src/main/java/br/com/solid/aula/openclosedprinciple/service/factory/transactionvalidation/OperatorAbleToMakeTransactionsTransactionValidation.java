package br.com.solid.aula.openclosedprinciple.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

@Component
public class OperatorAbleToMakeTransactionsTransactionValidation implements TransactionValidation{
    @Override
    public boolean isValid(TransactionDTO transaction) {
        return transaction.getOperator().isAbleToMakeSale();
    }
}

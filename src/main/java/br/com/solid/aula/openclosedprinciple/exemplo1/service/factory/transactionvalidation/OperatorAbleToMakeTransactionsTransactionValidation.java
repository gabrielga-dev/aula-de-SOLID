package br.com.solid.aula.openclosedprinciple.exemplo1.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

@Component
public class OperatorAbleToMakeTransactionsTransactionValidation implements TransactionValidation{
    @Override
    public boolean isValid(TransactionDTO transaction) {
        return transaction.getOperator().isAbleToMakeSale();
    }
}

package br.com.solid.aula.openclosedprinciple.exemplo1.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class NonPrimeClientMaxDiscountTransactionValidation implements TransactionValidation{
    @Override
    public boolean isValid(TransactionDTO transaction) {
        return (!transaction.getClient().isPrime()) && (BigDecimal.ZERO.compareTo(transaction.getDiscountValue()) == 0);
    }
}

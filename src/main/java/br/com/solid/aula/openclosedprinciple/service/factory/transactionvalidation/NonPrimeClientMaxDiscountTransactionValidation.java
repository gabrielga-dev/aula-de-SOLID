package br.com.solid.aula.openclosedprinciple.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class NonPrimeClientMaxDiscountTransactionValidation implements TransactionValidation{
    @Override
    public boolean isValid(TransactionDTO transaction) {
        return (!transaction.getClient().isPrime()) && (BigDecimal.ZERO.compareTo(transaction.getDiscountValue()) == 0);
    }
}

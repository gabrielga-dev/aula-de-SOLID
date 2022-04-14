package br.com.solid.aula.openclosedprinciple.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PrimeClientMaxDiscountTransactionValidation implements TransactionValidation{
    private static final BigDecimal MAX_PRIME_DISCOUNT = BigDecimal.valueOf(35L);

    @Override
    public boolean isValid(TransactionDTO transaction) {
        var comparition = MAX_PRIME_DISCOUNT.compareTo(transaction.getDiscountValue());
        return (transaction.getClient().isPrime()) && (comparition >= 0);
    }
}

package br.com.solid.aula.openclosedprinciple.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.domain.dto.ProductTransactionDTO;
import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FastCashierMaxItemQuantityTransactionValidation implements TransactionValidation{

    @Override
    public boolean isValid(TransactionDTO transaction) {
        if (transaction.getCashier().isQuickCashier()) {
            var totalItems = transaction.getItems().stream().map(ProductTransactionDTO::getQuantity)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            var comparition = BigDecimal.TEN.compareTo(totalItems);
            return comparition >= 0;
        }
        return true;
    }
}

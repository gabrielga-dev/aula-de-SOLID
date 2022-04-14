package br.com.solid.aula.openclosedprinciple.service;

import br.com.solid.aula.openclosedprinciple.domain.dto.ProductTransactionDTO;
import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;
import br.com.solid.aula.openclosedprinciple.repository.TransactionRepository;
import br.com.solid.aula.openclosedprinciple.service.factory.transactionvalidation.TransactionValidationApplier;
import br.com.solid.aula.openclosedprinciple.util.ErrorConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository repository;
    private final TransactionValidationApplier validationApplier;

    public TransactionDTO saveWithoutSOLID(TransactionDTO transaction) {

        var nonError = true;
        //o operador deve estar habilitado para realizar uma transação
        nonError = transaction.getOperator().isAbleToMakeSale();

        //clientes não prime não podem ter desconto
        if(!transaction.getClient().isPrime()) {
            nonError = nonError && (BigDecimal.ZERO.compareTo(transaction.getDiscountValue()) == 0);
        }

        //clientes prime podem ter até 35% de desconto
        if(transaction.getClient().isPrime()) {
            var comparition = BigDecimal.valueOf(35L).compareTo(transaction.getDiscountValue());
            nonError = nonError && (comparition >= 0);
        }

        //caixas rápidos podem ter até 10 itens.
        if(transaction.getCashier().isQuickCashier()) {
            var totalItems = transaction.getItems().stream().map(ProductTransactionDTO::getQuantity)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            var comparition = BigDecimal.TEN.compareTo(totalItems);
            nonError = nonError && (comparition >= 0);
        }

        if (!nonError) {
            throw new RuntimeException(ErrorConstants.INVALID_TRANSACTION_ERROR_MESSAGE);
        }

        return repository.save(transaction);
    }

    public TransactionDTO saveWithSOLID(TransactionDTO transaction) {
        if (validationApplier.isValid(transaction)){
            return repository.save(transaction);
        }
        throw new RuntimeException(ErrorConstants.INVALID_TRANSACTION_ERROR_MESSAGE);
    }
}
package br.com.solid.aula.openclosedprinciple.exemplo1.service.factory.transactionvalidation;

import br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto.TransactionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TransactionValidationApplier {
    private final List<TransactionValidation> validations;

    public boolean isValid(TransactionDTO transaction) {
        return validations.stream().anyMatch(validation -> validation.isValid(transaction));
    }
}

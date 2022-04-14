package br.com.solid.aula.openclosedprinciple.repository;

import br.com.solid.aula.openclosedprinciple.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

@Component
public class TransactionRepository {
    public TransactionDTO save(TransactionDTO transactionDTO) {
        return transactionDTO;
    }
}

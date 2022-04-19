package br.com.solid.aula.openclosedprinciple.exemplo1.repository;

import br.com.solid.aula.openclosedprinciple.exemplo1.domain.dto.TransactionDTO;
import org.springframework.stereotype.Component;

@Component
public class TransactionRepository {
    public TransactionDTO save(TransactionDTO transactionDTO) {
        return transactionDTO;
    }
}

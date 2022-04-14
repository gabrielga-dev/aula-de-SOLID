package br.com.solid.aula.openclosedprinciple.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ErrorConstants {
    public static final String INVALID_TRANSACTION_ERROR_MESSAGE = "Invalid transaction.";
}

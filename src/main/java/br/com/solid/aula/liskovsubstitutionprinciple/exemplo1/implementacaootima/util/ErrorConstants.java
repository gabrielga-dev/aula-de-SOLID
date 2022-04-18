package br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaootima.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ErrorConstants {

    public static final String UNABLE_TO_PROMOTE_EXCEPTION_MESSAGE = "Could not promote.";
    public static final String UNABLE_TO_DEMOTE_EXCEPTION_MESSAGE = "Could not demote.";
}

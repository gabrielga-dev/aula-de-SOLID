package br.com.solid.aula.singleresponsibilityprinciple.exemplo2.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ErrorConstants {

    public static final String NOT_VALID_FIELDS = "Invalid fields";
    public static final String ERROR_ON_SAVING = "Ops! Some error appeared when we're saving the data.";
}

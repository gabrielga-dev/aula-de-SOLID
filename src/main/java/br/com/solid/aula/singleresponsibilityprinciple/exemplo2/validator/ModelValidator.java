package br.com.solid.aula.singleresponsibilityprinciple.exemplo2.validator;

public interface ModelValidator <T> {
    boolean isFieldsValid(T toVerify);
}

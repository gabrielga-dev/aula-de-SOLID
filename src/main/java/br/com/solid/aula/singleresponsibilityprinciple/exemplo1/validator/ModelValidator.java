package br.com.solid.aula.singleresponsibilityprinciple.exemplo1.validator;

public interface ModelValidator <T> {
    boolean isFieldsValid(T toVerify);
}

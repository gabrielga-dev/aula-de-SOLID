package br.com.solid.aula.singleresponsibilityprinciple.exemplo1.validator;

import br.com.solid.aula.singleresponsibilityprinciple.exemplo1.model.dto.UserModel;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserModelValidator implements ModelValidator<UserModel>{
    @Override
    public boolean isFieldsValid(UserModel toVerify) {
        boolean isFieldsValid = Objects.nonNull(toVerify.getId());

        isFieldsValid = isFieldsValid && Objects.nonNull(toVerify.getName());
        isFieldsValid = isFieldsValid && Objects.nonNull(toVerify.getBirthDate());
        isFieldsValid = isFieldsValid && (toVerify.getName().length() >= 3) && (toVerify.getName().length() <= 50);
        isFieldsValid = isFieldsValid && (toVerify.getBirthDate().compareTo(LocalDateTime.now()) <= 0);
        return isFieldsValid;
    }
}

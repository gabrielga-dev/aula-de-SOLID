package br.com.solid.aula.singleresponsibilityprinciple.exemplo1.service;

import br.com.solid.aula.singleresponsibilityprinciple.exemplo1.model.dto.UserModel;
import br.com.solid.aula.singleresponsibilityprinciple.exemplo1.validator.UserModelValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserModelValidator validationApplier;

    public void saveWithoutSOLID(UserModel userModel) {
        if (!userModel.isFieldsValid()){
            throw new RuntimeException("Invalid fields");
        }
        // Saving implementation...
    }

    public void saveWithSOLID(UserModel userModel) {
        if (!validationApplier.isFieldsValid(userModel)){
            throw new RuntimeException("Invalid fields");
        }
    }
}

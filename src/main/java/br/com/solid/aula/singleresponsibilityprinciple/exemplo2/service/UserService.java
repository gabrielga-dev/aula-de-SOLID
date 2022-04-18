package br.com.solid.aula.singleresponsibilityprinciple.exemplo2.service;

import br.com.solid.aula.singleresponsibilityprinciple.exemplo2.model.dto.UserModel;
import br.com.solid.aula.singleresponsibilityprinciple.exemplo2.repository.UserRepository;
import br.com.solid.aula.singleresponsibilityprinciple.exemplo2.util.ErrorConstants;
import br.com.solid.aula.singleresponsibilityprinciple.exemplo2.validator.UserModelValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserModelValidator validator;

    public void saveWithoutSOLID(UserModel userModel) {
        if (!validator.isFieldsValid(userModel)){
            throw new RuntimeException("Invalid fields");
        }

        try {
            repository.save(userModel);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Ops! Some error appeared when we're saving the data. - " + e.getLocalizedMessage()
            );
        }
    }


    private static final String NOT_VALID_FIELDS = "Invalid fields";
    private static final String ERROR_ON_SAVING = "Ops! Some error appeared when we're saving the data.";

    public void saveWithoutSOLID2(UserModel userModel) {
        if (!validator.isFieldsValid(userModel)){
            throw new RuntimeException(NOT_VALID_FIELDS);
        }

        try {
            repository.save(userModel);
        } catch (Exception e) {
            throw new RuntimeException(ERROR_ON_SAVING);
        }
    }




    public void saveWithSOLID(UserModel userModel) {
        if (!validator.isFieldsValid(userModel)){
            throw new RuntimeException(ErrorConstants.NOT_VALID_FIELDS);
        }

        try {
            repository.save(userModel);
        } catch (Exception e) {
            throw new RuntimeException(ErrorConstants.ERROR_ON_SAVING);
        }
    }
}

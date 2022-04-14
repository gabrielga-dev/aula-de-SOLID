package br.com.solid.aula.singleresponsibilityprinciple.exemplo1.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
public class UserModel {
    private Long id;
    private String name;
    private LocalDateTime birthDate;

    public boolean isFieldsValid() {
        boolean isFieldsValid = Objects.nonNull(id);

        isFieldsValid = isFieldsValid && Objects.nonNull(name);
        isFieldsValid = isFieldsValid && Objects.nonNull(birthDate);
        isFieldsValid = isFieldsValid && (name.length() >= 3) && (name.length() <= 50);
        isFieldsValid = isFieldsValid && (birthDate.compareTo(LocalDateTime.now()) <= 0);
        return isFieldsValid;
    }
}

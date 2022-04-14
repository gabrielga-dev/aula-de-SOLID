package br.com.solid.aula.singleresponsibilityprinciple.exemplo2.model.dto;

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
}

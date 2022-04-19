package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseMemberModel {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
}

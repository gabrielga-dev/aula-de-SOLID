package br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaootima.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseMemberInformation {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
}

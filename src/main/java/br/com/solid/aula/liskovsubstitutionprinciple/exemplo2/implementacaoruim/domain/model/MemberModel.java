package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.domain.model;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.domain.type.GuildRank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MemberModel {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private GuildRank rank;
}


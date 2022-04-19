package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TemporaryMemberModel extends MemberModel {
    private LocalDateTime startTrial;
    private LocalDateTime finalTrial;
}

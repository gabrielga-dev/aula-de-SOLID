package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TemporaryMemberModel extends BaseMemberModel {
    private LocalDateTime startTrial;
    private LocalDateTime finalTrial;
}

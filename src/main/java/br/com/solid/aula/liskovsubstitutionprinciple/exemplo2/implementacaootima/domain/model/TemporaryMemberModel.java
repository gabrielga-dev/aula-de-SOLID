package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TemporaryMemberModel {
    private BaseMemberInformation baseMemberInformation; //PRIORIZANDO A COMPOSIÇÃO
    private LocalDateTime startTrial;
    private LocalDateTime finalTrial;
}

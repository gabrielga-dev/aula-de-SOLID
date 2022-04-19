package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima.domain.model;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima.domain.type.GuildRank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberModel {
    private BaseMemberInformation baseMemberInformation;//PRIORIZANDO A COMPOSIÇÃO
    private GuildRank rank;
}


package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.domain.model;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.domain.type.GuildRank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberModel extends BaseMemberModel {
    private GuildRank rank;
}


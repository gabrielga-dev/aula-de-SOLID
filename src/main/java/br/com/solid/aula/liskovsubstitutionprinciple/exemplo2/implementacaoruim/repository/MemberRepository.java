package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.repository;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.domain.model.MemberModel;
import org.springframework.stereotype.Component;

@Component
public class MemberRepository {
    public MemberModel save(MemberModel toSave){
        //saving process...
        return toSave;
    }
}

package br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaootima.repository;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaootima.domain.model.MemberModel;
import org.springframework.stereotype.Component;

@Component
public class MemberRepository {
    public MemberModel save(MemberModel toSave){
        //saving process...
        return toSave;
    }
}

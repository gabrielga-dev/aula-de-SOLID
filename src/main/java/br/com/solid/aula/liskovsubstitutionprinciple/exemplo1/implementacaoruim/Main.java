package br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaoruim;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaoruim.domain.model.MemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaoruim.domain.model.TemporaryMemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaoruim.repository.MemberRepository;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaoruim.service.MemberService;

public class Main {
    public static void main(String[] args) {
        new MemberService(new MemberRepository()).promote(new TemporaryMemberModel());// NÃO DEVERIA PERMITIR
        new MemberService(new MemberRepository()).promote(new MemberModel());// PERMITE
    }
}

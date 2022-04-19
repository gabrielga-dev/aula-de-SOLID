package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.domain.model.MemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.repository.MemberRepository;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.service.MemberService;

public class Main {
    public static void main(String[] args) {
        //new MemberService(new MemberRepository()).promote(new TemporaryMemberModel());// NÃO PERMITE
        new MemberService(new MemberRepository()).promote(new MemberModel());// PERMITE

        //new MemberService(new MemberRepository()).demote(new TemporaryMemberModel());// NÃO PERMITE
        new MemberService(new MemberRepository()).demote(new MemberModel());// PERMITE
    }
}

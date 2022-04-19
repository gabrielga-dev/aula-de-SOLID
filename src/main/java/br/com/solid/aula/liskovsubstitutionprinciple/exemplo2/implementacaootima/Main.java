package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima.domain.model.MemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima.repository.MemberRepository;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaootima.service.MemberService;

public class Main {
    public static void main(String[] args) {
        //new MemberService(new MemberRepository()).promote(new TemporaryMemberModel());// NÃO PERMITE
        new MemberService(new MemberRepository()).promote(new MemberModel());// PERMITE

        //new MemberService(new MemberRepository()).demote(new TemporaryMemberModel());// NÃO PERMITE
        new MemberService(new MemberRepository()).demote(new MemberModel());// PERMITE
    }
}

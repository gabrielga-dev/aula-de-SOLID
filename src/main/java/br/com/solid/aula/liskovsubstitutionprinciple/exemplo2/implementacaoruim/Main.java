package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.domain.model.MemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.domain.model.TemporaryMemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.repository.MemberRepository;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoruim.service.MemberService;

public class Main {
    public static void main(String[] args) {
        var memberService = new MemberService(new MemberRepository());
        var member = new MemberModel();
        var temporaryMember = new TemporaryMemberModel();

        memberService.promote(temporaryMember);// NÃO DEVERIA PERMITIR
        memberService.promote(member);// PERMITE

        memberService.demote(temporaryMember);// NÃO DEVERIA PERMITIR
        memberService.demote(member);// PERMITE
    }
}

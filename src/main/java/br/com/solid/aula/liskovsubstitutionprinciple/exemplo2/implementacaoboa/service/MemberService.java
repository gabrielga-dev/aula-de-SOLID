package br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.service;

import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.domain.model.MemberModel;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.repository.MemberRepository;
import br.com.solid.aula.liskovsubstitutionprinciple.exemplo2.implementacaoboa.util.ErrorConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MemberService {
     private final MemberRepository repository;

     public void promote(MemberModel member) {
          var upperRank = member.getRank().upperRank();
          if(Objects.equals(member.getRank(), upperRank)) {
               throw new RuntimeException(ErrorConstants.UNABLE_TO_PROMOTE_EXCEPTION_MESSAGE);
          }
          member.setRank(member.getRank().upperRank());
     }

     public void demote(MemberModel member) {
          var lowerRank = member.getRank().lowerRank();
          if(Objects.equals(member.getRank(), lowerRank)){
               throw new RuntimeException(ErrorConstants.UNABLE_TO_DEMOTE_EXCEPTION_MESSAGE);
          }
          member.setRank(member.getRank().lowerRank());
     }
}

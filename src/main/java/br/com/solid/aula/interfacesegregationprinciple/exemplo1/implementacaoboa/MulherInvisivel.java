package br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa;

import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiComSuperForca;
import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiQueFicaInvisivel;
import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiQueVoa;
import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiRico;

public class MulherInvisivel implements HeroiQueVoa, HeroiQueFicaInvisivel, HeroiComSuperForca, HeroiRico {
    @Override
    public void salva() {
        // implementação do salvamento
    }

    @Override
    public void voa() {
        // implementação do uso do poder de voar
    }

    @Override
    public void ficaInvisivel() {
        // implementação do uso da invisibilidade
    }

    @Override
    public void aplicaSuperForca() {
        // implementação do uso da super força
    }

    @Override
    public void usaRiquezas() {
        // implementação do uso das riquezas
    }
}

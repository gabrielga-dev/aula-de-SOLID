package br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa;

import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiComSuperForca;
import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiQueSoltaLaserPelosOlhos;
import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiQueVoa;
import br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoboa.classesdeheroi.HeroiRico;

public class SuperHomem  implements HeroiQueVoa, HeroiQueSoltaLaserPelosOlhos, HeroiComSuperForca, HeroiRico {
    @Override
    public void salva() {
        // implementação do salvamento
    }

    @Override
    public void voa() {
        // implementação do voo
    }

    @Override
    public void soltaLaserPelosOlhos() {
        // implementação do uso dos lasers pelos olhos
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

package br.com.solid.aula.dependencyinversionprinciple.exemplo1.implementacaoboa;

import br.com.solid.aula.dependencyinversionprinciple.exemplo1.implementacaoboa.tipodemaquinadecafe.MaquinaDeCafeEmFiltroDePapel;

public class MaquinaDeCafeSimples implements MaquinaDeCafeEmFiltroDePapel {
    @Override
    public void coaCafeEmFiltroDePapel() {
        // implementação da preparação do café
    }
}

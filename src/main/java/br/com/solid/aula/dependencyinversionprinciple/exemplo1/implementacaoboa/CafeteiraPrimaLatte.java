package br.com.solid.aula.dependencyinversionprinciple.exemplo1.implementacaoboa;

import br.com.solid.aula.dependencyinversionprinciple.exemplo1.implementacaoboa.tipodemaquinadecafe.MaquinaDeCafeEspresso;

public class CafeteiraPrimaLatte implements MaquinaDeCafeEspresso {

    @Override
    public void coaCafeEspresso() {
        // implementação da preparação do café
    }
}

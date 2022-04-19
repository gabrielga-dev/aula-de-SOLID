package br.com.solid.aula.dependencyinversionprinciple.exemplo1.implementacaoruim;

public class MaquinaDeCafeEspresso implements MaquinaDeCafe{
    @Override
    public void coaCafeEmFiltroDePapel() {
        throw new RuntimeException("Essa máquina não faz este tipo de café.");
    }

    @Override
    public void coaCafeEspresso() {
        // implementação da preparação do café
    }
}

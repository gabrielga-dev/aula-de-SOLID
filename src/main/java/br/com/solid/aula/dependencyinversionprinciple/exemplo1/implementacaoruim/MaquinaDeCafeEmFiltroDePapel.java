package br.com.solid.aula.dependencyinversionprinciple.exemplo1.implementacaoruim;

public class MaquinaDeCafeEmFiltroDePapel implements MaquinaDeCafe{
    @Override
    public void coaCafeEmFiltroDePapel() {
        // implementação da preparação do café
    }

    @Override
    public void coaCafeEspresso() {
        throw new RuntimeException("Essa máquina não faz este tipo de café.");
    }
}

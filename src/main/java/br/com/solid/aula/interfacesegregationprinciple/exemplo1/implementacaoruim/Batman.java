package br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoruim;

public class Batman implements Heroi {
    @Override
    public void salva() {
        // implementação do salvamento
    }

    @Override
    public void voa() {
        throw new RuntimeException("O batman não voa");
    }

    @Override
    public void ficaInvisivel() {
        throw new RuntimeException("O batman não fica invisivel");
    }

    @Override
    public void soltaLaserPelosOlhos() {
        throw new RuntimeException("O batman não solta laser pelos olhos");
    }

    @Override
    public void aplicaSuperForca() {
        throw new RuntimeException("O batman não tem super força");
    }

    @Override
    public void usaRiquezas() {
        // implementação do uso das riquezas
    }
}

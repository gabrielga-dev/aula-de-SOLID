package br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoruim;

public class MulherInvisivel implements Heroi {
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
    public void soltaLaserPelosOlhos() {
        throw new RuntimeException("A mulher invisível não solta lase pelos olhos");
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

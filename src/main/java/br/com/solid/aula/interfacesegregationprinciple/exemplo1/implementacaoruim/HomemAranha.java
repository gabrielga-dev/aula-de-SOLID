package br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoruim;

public class HomemAranha implements Heroi {
    @Override
    public void salva() {
        // implementação do salvamento
    }

    @Override
    public void voa() {
        throw new RuntimeException("O homem aranha não voa");
    }

    @Override
    public void ficaInvisivel() {
        throw new RuntimeException("O homem aranha não fica invisível");
    }

    @Override
    public void soltaLaserPelosOlhos() {
        throw new RuntimeException("O homem aranha não solta lase pelos olhos");
    }

    @Override
    public void aplicaSuperForca() {
        // implementação do uso da super força
    }

    @Override
    public void usaRiquezas() {
        throw new RuntimeException("O homem aranha não é rico");
    }
}

package br.com.solid.aula.interfacesegregationprinciple.exemplo1.implementacaoruim;

public class SuperHomem  implements Heroi {
    @Override
    public void salva() {
        // implementação do salvamento
    }

    @Override
    public void voa() {
        // implementação do voo
    }

    @Override
    public void ficaInvisivel() {
        throw new RuntimeException("O super homem não fica invisível");
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

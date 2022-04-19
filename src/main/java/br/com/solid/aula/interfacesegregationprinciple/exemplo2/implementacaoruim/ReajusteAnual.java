package br.com.solid.aula.interfacesegregationprinciple.exemplo2.implementacaoruim;

import java.math.BigDecimal;

public class ReajusteAnual implements ReajusteSalarial {
    @Override
    public BigDecimal valorBruto(BigDecimal salarioAtual) {
        return salarioAtual.multiply(BigDecimal.valueOf(0.09));
    }

    @Override
    public BigDecimal valorImpostoDeRenda(BigDecimal valorBruto) {
        return BigDecimal.ZERO;
    }
}

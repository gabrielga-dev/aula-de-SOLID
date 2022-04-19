package br.com.solid.aula.interfacesegregationprinciple.exemplo2.implementacaoruim;

import java.math.BigDecimal;

public class ReajustePromocao implements ReajusteSalarial {
    @Override
    public BigDecimal valorBruto(BigDecimal salarioAtual) {
        return salarioAtual.multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public BigDecimal valorImpostoDeRenda(BigDecimal valorBruto) {
        return valorBruto.multiply(BigDecimal.valueOf(0.09));
    }
}

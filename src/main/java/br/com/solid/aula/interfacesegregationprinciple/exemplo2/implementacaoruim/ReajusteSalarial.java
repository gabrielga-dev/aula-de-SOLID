package br.com.solid.aula.interfacesegregationprinciple.exemplo2.implementacaoruim;

import java.math.BigDecimal;

public interface ReajusteSalarial {
    BigDecimal valorBruto(BigDecimal salarioAtual);
    BigDecimal valorImpostoDeRenda(BigDecimal valorBruto);
}


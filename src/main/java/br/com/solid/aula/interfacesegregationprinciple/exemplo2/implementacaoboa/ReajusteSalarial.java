package br.com.solid.aula.interfacesegregationprinciple.exemplo2.implementacaoboa;

import java.math.BigDecimal;

public interface ReajusteSalarial {
    BigDecimal valorBruto(BigDecimal salarioAtual);
}

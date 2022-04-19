package br.com.solid.aula.interfacesegregationprinciple.exemplo2.implementacaoboa;

import java.math.BigDecimal;

public interface ReajusteSalarialComImpostoDeRenda extends ReajusteSalarial {
    BigDecimal valorImpostoDeRenda(BigDecimal valorBruto);
}

package com.Google.Teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteGoogle extends BaseTest {
    @Test
    public void testarPesquisaNoGoogle() {
        GooglePO googlePage = new GooglePO(chrome);
        googlePage.realizarPesquisa("Velocidade da internet");
        String resultados = googlePage.getTextoResultados();
        assertTrue(resultados.contains("Resultados da pesquisa"));
        //assertTrue(resultados.contains("HMMM BOLO"));
    }
}

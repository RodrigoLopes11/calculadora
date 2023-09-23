package junitcalculadora;

import JUnitCalculadora.Adicao;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdicaoTest {

    @Test
    public void soma() {
        Adicao adicao = new Adicao();
        int resultado = adicao.soma(3, 4);

        // Verifica se a soma de 3 e 4 é igual a 7
        assertEquals(7, resultado);
    }
}
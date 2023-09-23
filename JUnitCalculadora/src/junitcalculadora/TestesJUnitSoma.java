package junitcalculadora;

import JUnitCalculadora.Adicao;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestesJUnitSoma {
    
    @Test
    public static void main(String[] args) {
        System.out.println("Bem vindo á sua Calculadora Virtual!");
            //criação do objeto da classe Adicao
            Adicao adicao = new Adicao();
            //chama o metódo para fazer a soma criado na classe Adicao
            int resultado = adicao.soma(3, 4);

            // Verifica se a soma dos números bate com o número selecionado abaixo utilizando JUnit
            assertEquals(7, resultado);
            System.out.println(resultado);
            
            int resultado2 = adicao.soma(20, 1);
            assertEquals(19, resultado2);
            System.out.println(resultado2);
            
            int resultado3 = adicao.soma(19, 17);
            assertEquals(36, resultado3);
            System.out.println(resultado3);
    }    
}
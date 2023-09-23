package junitcalculadora;

import JUnitCalculadora.Multiplicacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteMultiplicacaoJUnit {
    
    @Test
    public static void main(String[] args) {
        // introdução á calculadora
        System.out.println("Bem vindo á sua Calculadora Virtual!");
            //criação do objeto da classe Multiplicacao
            Multiplicacao multiplicacao = new Multiplicacao();
            //chama o metódo de multiplicação criado na classe Multiplicacao
            int resultado = multiplicacao.multi(2, 4);

            // Verifica se a multiplicação dos números bate com o número selecionado abaixo utilizando JUnit
            assertEquals(7, resultado);
            System.out.println(resultado);
            
            int resultado2 = multiplicacao.multi(10, 8);
            assertEquals(80, resultado2);
            System.out.println(resultado2);
            
            int resultado3 = multiplicacao.multi(5, 9);
            assertEquals(35, resultado3);
            System.out.println(resultado3);
            
    }    
}
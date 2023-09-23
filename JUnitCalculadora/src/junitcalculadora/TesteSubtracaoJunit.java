package junitcalculadora;

import JUnitCalculadora.Subtracao;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSubtracaoJunit {
    
    @Test
    public static void main(String[] args) {
       
        System.out.println("Bem vindo á sua Calculadora Virtual!");
            //criação do objeto da classe Subtracao
            Subtracao subtracao = new Subtracao();
            //chama o metódo de subtração criado na classe Subtracao
            int resultado = subtracao.sub(10, 2);

            // Verifica se a subtração dos números bate com o número selecionado abaixo utilizando JUnit
            assertEquals(8, resultado);
            System.out.println(resultado);
            
            int resultado2 = subtracao.sub(20, 42);
            assertEquals(-22, resultado2);
            System.out.println(resultado2);
            
            int resultado3 = subtracao.sub(100, 20);
            assertEquals(70, resultado3);
            System.out.println(resultado3);
    }    
}
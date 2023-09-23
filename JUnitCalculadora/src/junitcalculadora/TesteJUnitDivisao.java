package junitcalculadora;

import JUnitCalculadora.Divisao;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteJUnitDivisao {
    
    @Test
    public static void main(String[] args) {
        // introdução á calculadora
        System.out.println("Bem vindo á sua Calculadora Virtual!");
        //criação do objeto da classe Divisao     
        Divisao divisao = new Divisao();
        //chama o metódo de divisão criado na classe Divisao
        int resultado = divisao.div(10, 2);

        // Verifica se a divisão dos números bate com o número selecionado abaixo utilizando JUnit
        assertEquals(5, resultado);
        System.out.println(resultado); 
        
        int resultado2 = divisao.div(15, 3);
        assertEquals(8, resultado2);
        System.out.println(resultado2);
        
        int resultado3 = divisao.div(45, 3);
        assertEquals(15, resultado3);
        System.out.println(resultado3);
        
    }    
}
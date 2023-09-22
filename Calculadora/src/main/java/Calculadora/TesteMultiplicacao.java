package Calculadora;

public class TesteMultiplicacao {
    public static void main(String[] args) {
        
        System.out.println("Bem vindo á sua Calculadora Virtual!");
        // criação do objeto da classe Multiplicação
        Multiplicacao multiplicacao = new Multiplicacao();
        // utilizado para chamar o metódo para multiplicar criado na classe Multiplicacao
        int mult = multiplicacao.multi(1,7);
        
       System.out.println("A multiplicacao dos números é igual a " + mult);
       
       int mult2 = multiplicacao.multi(45,3);
        
       System.out.println("A multiplicacao dos números é igual a " + mult2);
       
       int mult3 = multiplicacao.multi(12,5);
        
       System.out.println("A multiplicacao dos números é igual a " + mult3);
    }
}

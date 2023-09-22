package Calculadora;

public class TesteSubtracao {
    public static void main(String[] args) {
        
        System.out.println("Bem vindo á sua Calculadora Virtual!");
        // criação do objeto da classe Subtracao
        Subtracao subtracao = new Subtracao();
        // utilizado para chamar o metódo para somar criado na classe Adicao
        int sub = subtracao.subtracao(15,8);
        
       System.out.println("A subtração dos números é igual a " + sub);
       
       int sub2 = subtracao.subtracao(-10,19);
        
       System.out.println("A subtração dos números é igual a " + sub2);
       
       int sub3 = subtracao.subtracao(8,11);
        
       System.out.println("A subtração dos números é igual a " + sub3);
    }
}
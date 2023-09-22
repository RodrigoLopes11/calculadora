package Calculadora;

public class TesteDivisao {
    public static void main(String[] args) {
        
        System.out.println("Bem vindo á sua Calculadora Virtual!");
        // criação do objeto da classe Divisao
        Divisao divisao = new Divisao();
        
        //chama o metódo de divisão da classe Divisao
        int div = divisao.div(21,7);
        
       System.out.println("A Divisão dos números é igual a " + div);
       
       int div2 = divisao.div(100,10);
        
       System.out.println("A Divisão dos números é igual a " + div2);
       
       int div3 = divisao.div(169,13);
        
       System.out.println("A Divisão dos números é igual a " + div3);
    }
}


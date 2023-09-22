package Calculadora;

public class TesteSoma {
    public static void main(String[] args) {
        
        System.out.println("Bem vindo á sua Calculadora Virtual!");
        // criação do objeto da classe Adiçao
        Adicao adicao = new Adicao();
        // utilizado para chamar o metódo para somar criado na classe Adicao
        int somar = adicao.soma(8,9);
        
       System.out.println("A soma dos números é igual a " + somar);
       
       int somar2 = adicao.soma(12,19);
        
       System.out.println("A soma dos números é igual a " + somar2);
       
       int somar3 = adicao.soma(10,-9);
        
       System.out.println("A soma dos números é igual a " + somar3);
    }
}
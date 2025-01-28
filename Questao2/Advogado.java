package Questao2;

public class Advogado extends Funcionario {
    
    
    public Advogado(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalho() {
        System.out.println("O advogado está liberando marginal");
    }

   
    public void defenderCliente() {
        System.out.println("O advogado está defendendo um cliente.");
    }
}


package Questao2;

public class Policial extends Funcionario {


    public Policial(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalho() {
        System.out.println("O policial está prendendo marginal");
    }

    
    public void prenderSuspeito() {
        System.out.println("O policial está prendendo um suspeito.");
    }
}

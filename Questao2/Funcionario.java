package Questao2;
public class Funcionario {
    protected String nome;
    protected double salario;

   
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

   
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }

    public void trabalho() {
        System.out.println("O funcionário está trabalhando");
    }

    
    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.println("Salário com aumento: R$" + salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



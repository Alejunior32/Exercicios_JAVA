package desafios.Herança;

/*
Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize o conceito de Herança para
 remodelá-lo e implemente um programa que explore o domínio em questão:
Screenshot-from-2022-05-23-15-16-50

Regras:
a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor), uma constante para
armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
c) Consultores ganham somente pelas horas que trabalharam.
*/

public abstract class Funcionario {

    private String nome;
    private String cpf;

    final double SALARIO_MINIMO = 1212.0;

    public Funcionario() {
    }
    public Funcionario(String nome, String cpf){
        this.cpf=cpf;
        this.nome=nome;
    }

    public abstract double calcularSalario();


}

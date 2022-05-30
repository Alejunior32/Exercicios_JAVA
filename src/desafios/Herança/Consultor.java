package desafios.Herança;

public class Consultor extends Funcionario{

    private double valorHora;
    private long horasTrabalhadas;


    public Consultor(String nome, String cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        return (valorHora*horasTrabalhadas);
    }

}

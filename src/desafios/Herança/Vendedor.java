package desafios.Herança;

public class Vendedor extends Funcionario{

    private double comissao;
    private long numeroVendas;

    public Vendedor(String nome, String cpf, double comissao, long numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    public double calcularSalario(){
        return SALARIO_MINIMO+(comissao*numeroVendas);
    }

}

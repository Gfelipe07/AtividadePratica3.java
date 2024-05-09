public class Gerente extends Funcionario implements Trabalhavel {
    private double bonusAnual;
    private String equipe;

    public Gerente(String nome, String matricula, double bonusAnual, String equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    @Override
    public double calcularSalario() {
        // Implemente o cálculo do salário para o gerente, considerando o bônus anual
        return 0.0; // implemente conforme a lógica necessária
    }

    // Implementação dos métodos da interface Trabalhavel
    @Override
    public void trabalhar() {
        // Implemente a lógica para o trabalho de um gerente
    }

    @Override
    public void relatarProgresso() {
        // Implemente a lógica para relatar o progresso de um gerente
    }
}

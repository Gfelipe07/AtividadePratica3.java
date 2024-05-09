public class Estagiario extends Funcionario implements Trabalhavel {
    private int horasTrabalho;
    private String supervisor;

    public Estagiario(String nome, String matricula, int horasTrabalho, String supervisor) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
    }

    @Override
    public double calcularSalario() {
        // Implemente o cálculo do salário para o estagiário
        return 0.0; // implemente conforme a lógica necessária
    }

    // Implementação dos métodos da interface Trabalhavel
    @Override
    public void trabalhar() {
        // Implemente a lógica para o trabalho de um estagiário
    }

    @Override
    public void relatarProgresso() {
        // Implemente a lógica para relatar o progresso de um estagiário
    }
}

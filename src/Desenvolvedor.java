public class Desenvolvedor extends Funcionario implements Trabalhavel {
    private String tecnologias;

    public Desenvolvedor(String nome, String matricula, String tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
        // Implemente o cálculo do salário para o desenvolvedor
        return 0.0; // implemente conforme a lógica necessária
    }

    // Implementação dos métodos da interface Trabalhavel
    @Override
    public void trabalhar() {
        // Implemente a lógica para o trabalho de um desenvolvedor
    }

    @Override
    public void relatarProgresso() {
        // Implemente a lógica para relatar o progresso de um desenvolvedor
    }
}

public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, int matricula, double salario, String projeto) {
        super(nome, matricula, salario);
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "Gerente - " + super.toString() + ", Projeto: " + projeto;
    }
}

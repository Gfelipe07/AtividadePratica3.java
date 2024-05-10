public class Estagiario extends Funcionario {

    public Estagiario(String nome, int matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public String toString() {
        return "Estagiário - " + super.toString();
    }
}

import java.util.List;

public class Desenvolvedor extends Funcionario {
    private List<String> tecnologias;

    public Desenvolvedor(String nome, int matricula, double salario, List<String> tecnologias) {
        super(nome, matricula, salario);
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return "Desenvolvedor - " + super.toString();
    }
}

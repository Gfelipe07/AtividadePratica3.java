import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static Funcionario buscar(int matricula) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getMatricula() == matricula) {
                return funcionario;
            }
        }
        return null;
    }

    public static void remover(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);
    }
}

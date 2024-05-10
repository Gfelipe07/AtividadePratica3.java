import java.util.Arrays;
import java.util.List;

public class Sistema {

    private static void exibirMenu() {
        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Remover Funcionário");
        System.out.println("3 - Listar Funcionários");
        System.out.println("4 - Buscar Funcionário por Matrícula");
        System.out.println("5 - Sair");
        System.out.print("\nDigite uma opção: ");
    }

    private static void cadastrarFuncionario() {
        System.out.println("\nNovo Funcionário");
        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Salário: ");
        double salario = Console.lerDouble();

        System.out.println("\nTipo de funcionário:");
        System.out.println("1 - Estagiário");
        System.out.println("2 - Desenvolvedor");
        System.out.println("3 - Gerente");
        System.out.print("Escolha uma opção: ");
        int tipoFuncionario = Console.lerInt();

        switch (tipoFuncionario) {
            case 1:
                Estagiario estagiario = new Estagiario(nome, matricula, salario);
                Cadastro.cadastrar(estagiario);
                System.out.println("\nEstagiário cadastrado com sucesso!");
                break;
            case 2:
                System.out.print("Informe a lista de tecnologias separadas por vírgula: ");
                String tecnologiasInput = Console.lerString();
                List<String> tecnologias = Arrays.asList(tecnologiasInput.split(","));
                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matricula, salario, tecnologias);
                Cadastro.cadastrar(desenvolvedor);
                System.out.println("\nDesenvolvedor cadastrado com sucesso!");
                break;
            case 3:
                System.out.print("Projeto que gerencia: ");
                String projeto = Console.lerString();
                Gerente gerente = new Gerente(nome, matricula, salario, projeto);
                Cadastro.cadastrar(gerente);
                System.out.println("\nGerente cadastrado com sucesso!");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void procurarFuncionario() {
        System.out.println("\nBuscar Funcionário por Matrícula:");
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        Funcionario f = Cadastro.buscar(matricula);

        if (f != null) {
            System.out.println("\nFuncionário Localizado:");
            System.out.println(f.toString());
        } else {
            System.out.println("\nFuncionário com a matrícula " + matricula + " não foi encontrado.");
        }
    }

    private static void listarFuncionarios() {
        System.out.println("\nTodos os Funcionários Cadastrados:");

        if (Cadastro.getListaFuncionarios().isEmpty()) {
            System.out.println("\nNão há funcionários cadastrados.");
        } else {
            for (Funcionario funcionario : Cadastro.getListaFuncionarios()) {
                System.out.println(funcionario.toString());
            }
        }
    }

    private static void removerFuncionario() {
        System.out.print("\nInforme a matrícula do funcionário que deseja remover: ");
        int matricula = Console.lerInt();

        Funcionario f = Cadastro.buscar(matricula);

        if (f != null) {
            Cadastro.remover(f);
            System.out.println("\nFuncionário removido com sucesso!");
        } else {
            System.out.println("\nFuncionário com a matrícula " + matricula + " não foi encontrado.");
        }
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                cadastrarFuncionario();
                break;
            case 2:
                removerFuncionario();
                break;
            case 3:
                listarFuncionarios();
                break;
            case 4:
                procurarFuncionario();
                break;
            case 5:
                System.out.println("\nO programa foi finalizado.");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 5);
    }

    public static void main(String[] args) {
        executar();
    }
}

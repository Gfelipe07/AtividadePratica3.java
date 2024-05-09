import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        executar();
    }

    private static void exibirMenu() {
        System.out.println("\nSISTEMA DE GERENCIAMENTO DE FUNCIONÁRIOS");
        System.out.println("1) Adicionar Funcionário");
        System.out.println("2) Remover Funcionário");
        System.out.println("3) Exibir Todos os Funcionários");
        System.out.println("4) Buscar Funcionário por Nome ou Matrícula");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void verificarOpcao(int op) {
        // Consumir o caractere de nova linha
        scanner.nextLine();
    
        switch (op) {
            case 1:
                adicionarFuncionario();
                break;
            case 2:
                removerFuncionario();
                break;
            case 3:
                exibirFuncionarios();
                break;
            case 4:
                buscarFuncionario();
                break;
            case 0:
                System.out.println("\nO programa foi finalizado");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }

    private static void adicionarFuncionario() {
        // Implemente a lógica para adicionar um novo funcionário
    }

    private static void removerFuncionario() {
        // Implemente a lógica para remover um funcionário
    }

    private static void exibirFuncionarios() {
        // Implemente a lógica para exibir todos os funcionários
    }

    private static void buscarFuncionario() {
        // Implemente a lógica para buscar um funcionário por nome ou matrícula
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = scanner.nextInt();
            verificarOpcao(op);
        } while (op != 0);
        scanner.close();
    }
}

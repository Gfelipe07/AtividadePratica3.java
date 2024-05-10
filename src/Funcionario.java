public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Salário: " + salario;
    }
}

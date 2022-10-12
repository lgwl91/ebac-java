package Empresa;

/**
 * @name class Funcionario
 * @author Lucas Lima
 * @version 1.0
 * Esta classe e responsavel por conter os atributos pertinentes aos funcionarios, assim como seus gets, sets e metodos.
 */
public class Funcionario {

    private String nome;
    private int matricula;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Esta funcao e responsavel por calcular o salario anual do funcionario (sem beneficios).
     * @return O salario do funcionario vezes 12
     */
    public double calcularSalarioAnual(){
        return this.salario * 12;
    }
}

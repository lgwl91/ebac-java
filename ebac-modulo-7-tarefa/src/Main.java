import Empresa.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.setNome(ler.nextLine());

        System.out.print("Matricula: ");
        func.setMatricula(ler.nextInt());

        System.out.print("Idade: ");
        func.setIdade(ler.nextInt());

        System.out.print("Salario: ");
        func.setSalario(ler.nextDouble());

        System.out.println("Nome: " + func.getNome());
        System.out.println("Matricula: " + func.getMatricula());
        System.out.println("Idade: " + func.getIdade());
        System.out.println("Salario: " + func.getSalario());
        System.out.println("Salario Anual: " + func.calcularSalarioAnual());
    }
}
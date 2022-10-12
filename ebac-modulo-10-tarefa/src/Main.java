import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer opcao = 1;
        Float nota1, nota2, nota3, nota4, media;

        while(opcao != 0){
            System.out.println("Qualquer numero para continuar ou 0 para sair: ");
            opcao = s.nextInt();
            if(opcao == 0){
                System.out.println("Saiu...");
                break;
            }

            System.out.println("Nota 1: ");
            nota1 = s.nextFloat();
            System.out.println("Nota 2: ");
            nota2 = s.nextFloat();
            System.out.println("Nota 3: ");
            nota3 = s.nextFloat();
            System.out.println("Nota 4: ");
            nota4 = s.nextFloat();

            media = mediaNota(nota1,nota2,nota3,nota4);
            System.out.println("Media: " + media);
            System.out.println(situacaoMateria(media));
        }
    }

    public static Float mediaNota(Float nota1, Float nota2, Float nota3, Float nota4){

        return (nota1 + nota2 + nota3 + nota4)/4;
    }

    public static String situacaoMateria(Float media){

        if(media >= 7.0){
            return "Aprovado!";
        }
        else if(media >= 5.0 && media < 7.0){
            return "Recuperação!";
        }
        else{
            return "Reprovado!";
        }
    }
}
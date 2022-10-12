package br.com.lucas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<Pessoa> lm = new ArrayList<Pessoa>();
        List<Pessoa> lf = new ArrayList<Pessoa>();

        for(Integer i = 0; i < 5; i++){
            String nome;
            String sexo;

            System.out.println("Pessoa " + i);
            System.out.print("Nome: ");
            nome = s.next();
            System.out.print("Sexo: ");
            sexo = s.next();

            Pessoa pessoa = new Pessoa(nome, sexo);

            if(pessoa.getSexo().equals("M")){
                lm.add(pessoa);
            }
            else if(pessoa.getSexo().equals("F")) {
                lf.add(pessoa);
            }
            else{
                System.out.println("Sexo precisa ser M ou F.");
                i--;
            }
        }

        System.out.println("Masculino:");
        System.out.println(lm);
        System.out.println("Feminino:");
        System.out.println(lf);
    }
}


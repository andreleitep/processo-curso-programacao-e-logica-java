package com.example.LP34MEstruturaWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero = 3;

        while (numero > 0) {

            System.out.print("Proximo aluno: ");
            String nomeAluno = leitor.nextLine();
            System.out.print("Idade: ");
            int idadeAluno = leitor.nextInt();
            leitor.nextLine();

            System.out.println("O nome do aluno é: " + nomeAluno 
                    + " e sua idade é: " + idadeAluno + " anos");
            
            numero = numero - 1;
            
        }

    }
}
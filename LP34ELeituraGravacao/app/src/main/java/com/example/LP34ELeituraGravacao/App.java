package com.example.LP34ELeituraGravacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String linha = leitor.nextLine();
        String palavra = leitor.next();
        
        System.out.println("Exibe texto e pula linha");
        System.out.print("Exibe linha e não pula linha: ");
        
    }
}

package com.example.LP34JExercicios15Verifica16Media;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int numero;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Está no intervalo.");
        } else{
            System.out.println("Não está no intervalo");
        }
        
    }
}

package com.example.LP34OLucro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float somaCusto = 0;
        float somaVenda = 0;
        float precoCusto;
        float precoVenda;
        
        for(int i = 0; i < 40; i++){
            System.out.print("Digite o preco de Custo: ");
            precoCusto = leitor.nextFloat();
            
            System.out.print("Digite o preco de Venda: ");
            precoVenda = leitor.nextFloat();
            
            somaCusto = somaCusto + precoCusto;
            somaVenda = somaVenda + precoVenda;
            
            if(precoCusto > precoVenda){
                System.out.println("Prejuizo de: " + (precoCusto - precoVenda));
            } else {
                if(precoVenda > precoCusto){
                    System.out.println("Lucro de: " + (precoVenda - precoCusto));
                } else {
                    System.out.println("Preco e custo se anulam");
                }
            }
        }
        System.out.println("A media do preco de custo e: " + (somaCusto / 40));
        System.out.println("A media do preco de venda e: " + (somaVenda / 40));
        
    }
}

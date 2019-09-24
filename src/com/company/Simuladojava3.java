package com.company;

import java.util.Scanner;

public class Simuladojava3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int produto;
        double preco = 0;

        while(true) {
            System.out.println("[1]      perfume         |  R$5,00  ");
            System.out.println("[2]      arroz    |  R$12,00 ");
            System.out.println("[3]      feijão        |  R$7,00  ");
            System.out.println("[4]      arroz         |  R$5,00  ");
            System.out.println("[5]      sair ");
            System.out.print("Informe o produto que você gostaria de adquirir: ");
            produto = sc.nextInt();

            if (produto == 1){
                preco += 5;
            }
            if (produto == 2){
                preco += 12;
            }
            if (produto == 3){
                preco += 7;
            }
            if (produto == 4){
                preco += 5;
            }
            if (produto == 5){
                break;
            }

        }
        System.out.println("O total da sua compra é de: R$"+preco);
        if (preco <= 30){
            System.out.println("Você não receberá desconto!");
        }
        if (preco > 30 & preco < 100.1){
            System.out.println("Você receberá um desconto de 10%!");
            preco = preco-(preco*0.1);
            System.out.println("Você agora paga R$"+preco);
        }
        if (preco > 100 ){
            System.out.println("Você receberá um desconto de 15%!");
            preco = preco-(preco*0.15);
            System.out.println("Você agora paga R$"+preco);
        }
    }
}
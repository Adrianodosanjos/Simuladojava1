package com.company;

import java.util.Scanner;

public class Simuladojava2 {
    Scanner scan= new Scanner(System.in);
        public static void menu(){
            System.out.println("Bem vindo à Caixa Economica Federal");
                System.out.println("1. Poupança");
                    System.out.println("2. Fundo de renda fixa");
                System.out.println("0. Sair");
            }
        public static void Poupança(){
    System.out.println("Poupança");
        }
            public static void Rendafixa(){
                System.out.println("Renda fixa");
                    }
                public static void main(String[] args) {
            int opcao;
        Scanner entrada = new Scanner(System.in);
    menu();
        opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    Poupança();
                System.out.print("Quanto você deseja depositar: R$");
            double valor;
        valor=entrada.nextDouble();
    double rendimento;
        rendimento=(valor*0.03)+valor;
            System.out.println("Você terá um rendimento mensal de 3%");
                System.out.println("O valor de seu rendimento é R$"+rendimento);
                    System.out.println("==============================================");
                break;
            case 2:
        Rendafixa();
    System.out.print("Informe seu valor fixo: R$");
        double renda;
            renda=entrada.nextDouble();
                double rendafixa;
                    rendafixa=(renda*0.04)+renda;
                System.out.print("Seu valor rendeu, ");
            System.out.println("o valor de sua renda fixa agora é de R$"+rendafixa);
        System.out.println("==============================================");
    break;
        default:
            System.out.println("Saindo...");
                }
            }
        }


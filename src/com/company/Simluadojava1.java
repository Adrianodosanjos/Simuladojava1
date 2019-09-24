package com.company;
import java.util.Scanner;
public class Simluadojava1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira suas notas das Av1, Av2:");int a;
        int b;
        a=sc.nextInt();
        b=sc.nextInt();
        int media;
        media=(a+b)/2;
        System.out.println("Sua média foi "+media);
        if (media<=2.9) {
            System.out.println("Reprovado.");
        }else if(media>3&&media<7) {
            System.out.println("Recuperação.");
        }else{
            System.out.println("Aprovado.");
        }
    }
}

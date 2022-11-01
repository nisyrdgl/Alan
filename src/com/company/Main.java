package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int a, b, c;

        System.out.println("a kenarini giriniz:");
        a = scann.nextInt();
        System.out.println("b kenarini giriniz:");
        b = scann.nextInt();
        System.out.println("c kenarini giriniz:");
        c = scann.nextInt();
        Double u = Double.valueOf((a + b + c) / 2);
        Double alan = u * (u - a) * (u - b) * (u - c);
        System.out.println("alan:" + alan);


    }
}

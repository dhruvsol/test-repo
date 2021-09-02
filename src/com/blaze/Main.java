package com.blaze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {

        Scanner input = new Scanner (System.in);
        System.out.print("enter 1" );
        int a = input.nextInt();
        System.out.print("enter 2");
        int b = input.nextInt();
        System.out.print("enter 3");
        int c = input.nextInt();
        int sums= a+b+c;
        return sums;
    }

}


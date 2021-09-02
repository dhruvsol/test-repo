package com.blaze;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        reverse();

    }
    static int  reverse (){
        Scanner main  = new Scanner(System.in) ;
        System.out.println("enter a number for reverse ");
        int a = main.nextInt();
        int rev=0;

        while (a!=0){
            int reminder = a%10;
//            int rev = 0;
            rev = rev * 10 + reminder ;
            a=a/10;
//            System.out.println("rev is "+ rev);

            }
        System.out.println("the rev is "+ rev);
        return reverse();


    }
}


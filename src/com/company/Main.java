
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of numbers");
        int n = in.nextInt();
        int arr[];
        arr = new int[n];
        for (int i = 0;i< arr.length; i++){
             arr[i] = in.nextInt();
        }
        for (int i = 0;i< arr.length; i++){
            s = s + arr[i];
        }
        System.out.println("summ = " + s);

    }
}

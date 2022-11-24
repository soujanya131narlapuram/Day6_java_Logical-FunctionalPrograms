package com.logical;
import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
    int num1 = 0, num2 = 1;
    System.out.println(num1);
    System.out.println(num2);
    for (int i = 2; i <= 8; i++){
        int n3 = num1 + num2;

    num1 = num2;
    num2 = n3;
    System.out.println(n3);
}

}
}

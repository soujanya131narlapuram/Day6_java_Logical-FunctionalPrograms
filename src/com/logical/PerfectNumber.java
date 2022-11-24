package com.logical;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        for( int i=1;i<=n/2;i++) {
            if (n % i == 0) {
                System.out.println("i:" + i);
                sum = sum + i;
            }
        }
        System.out.println("sum:"+sum);
        if(sum==n) {
            System.out.println("perfect number");
        }else {
            System.out.println("not a perfect number");
        }
    }
}

package com.logical;
import java.util.Scanner;
public class PrimeNumber {
        public static void main(String[] args) {
            System.out.println("enter the user input:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("a:" + a);
            int count = 0;
            if (a<2) {
                System.out.println("number is not a prime number:" + a);
            }
            for (int i = 1; i <= a; i++)
            {
                if (a % i == 0)
                    count=count+1;

            }
            if (count>2) {
                System.out.println("number is a  not prime number:" + a);
                System.out.println("count:" + count);
            }else {
                System.out.println("number is  a prime number:" + a);
                System.out.println("count:" + count);
            }

        }
    }


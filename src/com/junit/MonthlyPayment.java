package com.junit;
import java.util.Scanner;
public class MonthlyPayment {
public static void Monthly_payment()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the principle loan p,years y,amount R percentage: ");
    int p=sc.nextInt();
    int y=sc.nextInt();
    double R=sc.nextDouble();
    int  n=12*y;
    System.out.println("n:"+n);
    double r=R/(12*100);
    System.out.println(r);
    double  denominator=1-(Math.pow((1+r),(-n)));
    System.out.println("denominator:"+denominator);
    double numerator=(p*r);
    double payment=(p*r)/denominator;
    System.out.println("monthly payment:"+payment);
        }
    public static void main(String[] args){
        Monthly_payment();
    }
}

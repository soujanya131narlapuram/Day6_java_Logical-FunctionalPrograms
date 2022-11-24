package com.junit;
public class TemperatureConversion {
    public static void celsius_fahernhit(int c){
        double f=(c*(9/5))+(3/2);
        System.out.println("celsius to fahernhit:"+f);
    }
    public static void fahernhit_celsius(int f){
        double c=(f-32)*(5/9);
        System.out.println("fahernhit to celsius :"+c);
    }
public static void main(String[] args){

    celsius_fahernhit(4);
    fahernhit_celsius(6);
}
}

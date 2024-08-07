package javaprograms;

import java.util.Scanner;

public class Testexample6 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : " );
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("125 + 24 = "+(num1+num2));
        System.out.println("125 - 24 = "+(num1-num2));
        System.out.println("125 x 24 = "+(num1*num2));
        System.out.println("125 / 24 = "+(num1/num2));
        System.out.println("125 mod 24 = "+(num1%num2));
    }
}

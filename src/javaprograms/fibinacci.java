package javaprograms;

import java.util.Scanner;

public class fibinacci {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
       int a=0, b=1 ,c;
        System.out.println("enter a limit");
        int limit = sc.nextInt();

    for (int i=1;i<=limit;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
    }

    }
}

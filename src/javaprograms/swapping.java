package javaprograms;

public class swapping {
    public static void main (String args[]) {
        int a = 3, b = 5;
        System.out.println("before swapping a="+a+"and b="+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a="+a+"and b="+b);
    }

}

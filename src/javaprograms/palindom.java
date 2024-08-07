package javaprograms;

public class palindom {
    public static void main(String args[]){
        int a = 545, sum = 0;
        int b = a;
        while(a != 0){
            int rem = a % 10;
            sum = (sum * 10) + rem;
            a = a / 10;
        }
        if(b == sum){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

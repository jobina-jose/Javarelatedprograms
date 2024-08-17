package javaprograms;

public class ThrowExample {
     static void checkAge(int Age){
        if (Age < 18 ) {
            throw new ArithmeticException("Access denied - You must be 18 years old.");
        }
        else{
            System.out.println("Access graned - you are old enough!");
        }
    }
    public static void main(String args []){
        checkAge(19);
    }
}

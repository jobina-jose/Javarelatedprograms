package javaprograms;

public class ExceptionExample {
    public static void main(String args[]){
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("Someting went wrong");
        }
        finally {
            System.out.println("The 'try catch' is finished");
        }
    }
}

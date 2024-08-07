package javaprograms;

public class Testexample10 {
    public static void main (String args[]){
        int arr []={22,23,24,23,27,28};
        float avg, sum=0;
        int count=(arr.length);
        for (int age : arr) {
            sum += age;
        }
            avg=sum/count;

        System.out.println("average is "+avg);
    }
}

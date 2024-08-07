package javaprograms;

public class ArrayCompare {
    public static void main(String args[]){

        int arr[] = {4,58,1,9};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
         if (arr[i]>max) {
             max = arr[i];

         }

                }
        System.out.println(max);
    }
}

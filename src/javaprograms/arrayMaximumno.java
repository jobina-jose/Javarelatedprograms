package javaprograms;

public class arrayMaximumno {
    public static void main(String args[]){
        int arr[]={59,99,77,40};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

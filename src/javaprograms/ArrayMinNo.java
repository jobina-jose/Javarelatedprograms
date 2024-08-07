package javaprograms;

public class ArrayMinNo {
    public static void main(String[] args) {
        int arr[]={55,88,10,4,11};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

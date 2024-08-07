package javaprograms;

public class ArrayOrder {
    public static void main(String args[]){
        int arr[]={77,90,86,44,73,65};
        int temp = 0;
        System.out.println("Elements of original array");
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
            for (int j=i=1;j<arr.length;j++){
//                System.out.println(arr[j]);
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements of array stored in ascending order");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("hi");
    }
}

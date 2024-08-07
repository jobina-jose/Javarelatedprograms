package javaprograms;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[]={77,9,4,7,1,10};
        int temp=0;

        System.out.println("elements of original array");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements of array stored in ascending order");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

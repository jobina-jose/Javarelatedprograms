package javaprograms;

public class TestArray1 {
    public static void main (String args []){
        int arr[] = {1,2,3,4};
        boolean flag=false;
//        System.out.println("Repeated values:");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length-1 ;j++){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    flag=true;
                }


                }

        } 
        if(!flag){
            System.out.println("kkkk");
        }

    }
}

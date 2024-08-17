package javaprograms;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String args[]){
        HashSet<String> cars=new HashSet<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Mazda");;
        cars.add("ford");
        System.out.println("the cars are :"+cars);
        for(String i: cars){
            System.out.println(i);
        }
    }
}

package javaprograms;

import java.io.File;

public class TestFiledetailes {
    public static void main(String[] args) {
            File obj = new File("filename1.txt");
            if(obj.exists()){
                System.out.println(obj.getAbsoluteFile());
                System.out.println(obj.canRead());
                System.out.println(obj.length());
                System.out.println(obj.canWrite());
                System.out.println(obj.getName());









            }

    }
}

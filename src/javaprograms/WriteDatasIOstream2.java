package javaprograms;

import java.io.File;
import java.io.FileOutputStream;

public class WriteDatasIOstream2 {
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream("filename2.txt");
            byte[] a = {101, 102, 103, 104};
            obj.write(a);
            obj.close();
            System.out.println("successfully wrote");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
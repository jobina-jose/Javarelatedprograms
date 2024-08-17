package javaprograms;

import java.io.FileInputStream;
import java.io.IOException;

public class TestArraybyte {
    public static void main(String[] args) {
        try {
            FileInputStream obj = new FileInputStream("filename1.txt");
            byte[] a = new byte[10];
            obj.read(a);
            for(byte b:a){
                System.out.println((char)b);
            }
            obj.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
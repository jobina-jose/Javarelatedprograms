package javaprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileIOStream {
    public static void main(String[] args) {
        try {
            FileInputStream obj = new FileInputStream("filename1.txt");
            int data = obj.read();
            System.out.println((char) data);
            obj.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

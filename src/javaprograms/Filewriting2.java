package javaprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewriting2 {
    public static void main(String args[]) throws IOException {
        try {
            FileInputStream obj = new FileInputStream("filename1.txt");
            FileOutputStream myobj = new FileOutputStream("filename2.txt");
            int data;
            while ((data = obj.read()) != -1) {
                myobj.write(data);
            }

            System.out.println("Successfully wrote");
            obj.close();
            myobj.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

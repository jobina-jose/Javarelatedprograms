package javaprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaddatasioFile {
    public static void main(String[] args) {
        try{
        FileInputStream obj=new FileInputStream("filename1.txt");
        int data;
        while((data=obj.read())!=-1) {
            System.out.print((char)data);
        }
        obj.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

package javaprograms;

import java.io.FileOutputStream;
import java.io.IOException;

public class Writedataiostream {
    public static void main(String[] args) {
        try{
            FileOutputStream obj=new FileOutputStream("filename2.txt");
            obj.write(2000);
            System.out.println("successfully wrote");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

package javaprograms;

import java.io.File;
import java.util.Scanner;

public class TestReadFile {
    public static void main(String[] args) {
        try{

            File obj=new File("filename1.txt");
            Scanner myobj= new Scanner(obj);
            while (myobj.hasNext()){
                String data= myobj.nextLine();
                System.out.println(data);
            }
          myobj.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

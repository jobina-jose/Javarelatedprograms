package javaprograms;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String args[]){
        try {
            File obj = new File("filename1.txt");
            if (obj.createNewFile()) {
                System.out.println("Successfully created" + obj.getAbsolutePath());
            } else {
                System.out.println("file not created");
            }
//            File file= new File("D:\\jdbc\\file.txt");
//
//            if(file.createNewFile()){
//                System.out.println("Successfully created"+file.getAbsolutePath());
//            }
//            else{
//                System.out.println("file not created");
//            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

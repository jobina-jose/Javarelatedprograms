package javaprograms;

import java.io.File;

public class CreateFile2 {
    public static void main(String[] args) {
        try{
            File obj=new File("filename2.txt");
            if(obj.createNewFile()){
                System.out.println("successfully created "+obj.getAbsolutePath());
            }
            else {
                System.out.println("file not created");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("An error occured");
        }
    }
}

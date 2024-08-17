package javaprograms;

import java.io.File;

public class TestDeleteFile {
    public static void main(String[] args) {
        File obj = new File("filename.txt");
        if(obj.delete()){
            System.out.println("deleted file : "+obj.getName());

        }
        else{
            System.out.println("failed to delete the file.");
        }
    }
}

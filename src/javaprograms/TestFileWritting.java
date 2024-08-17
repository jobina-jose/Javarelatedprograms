package javaprograms;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWritting {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("filename1.txt");
            obj.write("hello java");
            obj.write(Integer.toString(45));
            obj.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

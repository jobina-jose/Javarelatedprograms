package javaprograms;

public class Testexample8 {
    public static void main (String args[]){

                String[][] pattern = {
                        {" ", " ", "J", " ", " ", "a", " ", " ", "v", " ", " ", "v", " ", " ", "a"},
                        {" ", " ", "J", " ", "a", " ", " ", "a", " ", " ", "v", " ", " ", "a", " ", "a"},
                        {"J", " ", "J", " ", "a", "a", "a", "a", "a", "a", " ", "V", " ", "V", " ", "a", "a", "a", "a", "a", "a"},
                        {"J", "J", " ", "a", " ", " ", "a", " ", " ", "V", " ", " ", "a", " ", "a"}
                };

                for (String[] row : pattern) {
                    for (String ch : row) {
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            }
        }



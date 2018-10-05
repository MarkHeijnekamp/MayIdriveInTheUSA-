
import java.util.Scanner;


public class Index {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.print("What is your age ?");
        int Age = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished
        reader.close();
        if (Age >= 17){
            System.out.println("yes you may drive in the USA");
        }
        if (Age <= 16){
            System.out.println("no you may not drive in the USA");

        }


    }

}
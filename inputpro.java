import java.util.Scanner;

public class inputpro {

    private static Scanner reader;

    public static void main(String[] args) {



        reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);

        
    }
    
}

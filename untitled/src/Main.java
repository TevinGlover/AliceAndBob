import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {
            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
           /// System.out.println("i = " + i);
            //*************************************
        String authorizedUser1 = "Alice";
        String authorizedUser2 = "Bob";

            Scanner scanner = new Scanner(System.in); // this calls in the scanner class & System Class
            System.out.print("Enter your name"); // this is printing to the user. the string.
            String name = scanner.nextLine(); // this accepts the user input. and stores it in an object called name.

            // PLAN OF ATTACK.( use a if else statement to see if the person name is equal to Alice or Bob
            //  then print (reply back its: your not Alice nor Bob if the name is wrong. an if it is on or
            //  the other greeting Alice or bob.)
        if (name.equals(authorizedUser1)) {
            System.out.print("Hello and welcome  Alice!");
        }
        else if (name.equals(authorizedUser2)){
            System.out.print("Hello and welcome Bob !");
        }
        else
        {
            System.out.print("your not Alice nor Bob");
        }


        }
    }
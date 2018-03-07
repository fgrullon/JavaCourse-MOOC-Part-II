
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Contacts phonebook = new Contacts(reader);
        phonebook.start();
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
    }
}

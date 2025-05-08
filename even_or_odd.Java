import java.util.Scanner;

public class evenOrOdd{
    // This program checks if a number is even or odd
    // and prints the result to the console.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // create scanner
        System.out.print("Enter a number: ");
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
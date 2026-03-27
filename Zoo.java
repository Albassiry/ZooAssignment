
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for details
        System.out.print("Enter animal name: ");
        String name = input.nextLine();

        System.out.print("Enter animal color: ");
        String color = input.nextLine();

        System.out.print("Enter animal age: ");
        int age = input.nextInt();
        input.nextLine(); // consume leftover newline

        System.out.print("Enter animal favorite food: ");
        String favFood = input.nextLine();

        // Create Animal object
        Animal animal = new Animal(name, color, age, favFood);

        // Print details
        animal.printDetails();

        input.close();
    }
}

package parker.learningJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// scanner is a built in class to get user input
        //creating a new instance of the object scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name);

        scanner.close();

    }
}

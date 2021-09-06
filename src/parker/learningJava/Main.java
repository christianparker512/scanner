package parker.learningJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// scanner is a built in class to get user input
        //creating a new instance of the object scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key);

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            //can get some info from the keyboard and use it with the nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age);
            } else {
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("unable to parse the year of birth");
        }
        scanner.close();
    }
}

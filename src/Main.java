import Model.Clients.*;
import java.util.Scanner;

/**
 * Identification comments:
 *   Name: Richard Joseph
 *   Experiment No: 02
 *   Experiment Title:
 *   Experiment Date:
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Main.java
 * @author:  Richard Joseph
 * Overview: This is the main class used to create objects for Client Class. In this file we have achieved the following
 * - Object Creation
 * - Calling Setters and Getters
 * - Creating Object Arrays
 * - Looping through Object Array
 * - Displaying contents of object array
 *
 */

public class Main {
    public static void main(String[] args) {

        //Creating a single Object
        Client c1 = new Client();

        // Using setters to set the values
        
        c1.setClient_name("Soham Patil");
        c1.setClient_age(18);
        c1.setClient_email("2023.soham.patil@ves.ac.in");
        c1.setClient_gender("Male");

        //Display client data
        c1.display();

        //Creating client object array
        Client clientArr[] = new Client[3];

        //Creating a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        //Using For Loop to Take user input for each client object
        for (int i = 0; i < clientArr.length; i++) {
            clientArr[i] = new Client();


        
            
            sc.nextLine(); // Consume newline

            System.out.println("Enter Client Name: ");
            String name = sc.nextLine();
            clientArr[i].setClient_name(name);

            System.out.println("Enter Client Age: ");
            int age = sc.nextInt();
            clientArr[i].setClient_age(age);
            sc.nextLine(); // Consume newline

            System.out.println("Enter Client Email: ");
            String email = sc.nextLine();
            clientArr[i].setClient_email(email);

            System.out.println("Enter Client Gender: ");
            String gender = sc.nextLine();
            clientArr[i].setClient_gender(gender);
        }

        //Using For Loop to display each client object data
        for (int i = 0; i < clientArr.length; i++) {
            System.out.println("Client No: " + (i + 1));
            clientArr[i].display();
            System.out.println("________________________");
        }
    }
}

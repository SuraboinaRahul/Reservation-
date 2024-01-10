
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Online_reservation_system {
    private static Map<String, String> users = new HashMap<>(); // Stores login id and password

    public static void main(String[] args) {
        // sample login credentials
        // Here we have already give the valid login credentials
        users.put("user_1", "password1");
        users.put("user_2", "password2");
        users.put("user_3", "password3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome to the Online Reservation System ***");

        // Login
        boolean loggedIn = false;
        do {
            System.out.print("Enter your login id: ");
            String loginId = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (isValidUser(loginId, password)) {
                loggedIn = true;
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid login credentials! Please try again");
            }
        } while (!loggedIn);

        System.out.println("\nReservation Form");
        System.out.println("Please fill in the necessary details:");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String trainNumber = "123";
        String trainName = "Express Train";

        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);

        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();

        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();

        System.out.print("Enter from (place): ");
        String fromPlace = scanner.nextLine();

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.println("\nReservation successful!");

        System.out.println("\nCancellation Form");
        System.out.print("Enter your PNR number: ");
        String pnrNumber = scanner.nextLine();
        System.out.println("Reservation details for PNR number " + pnrNumber + ":");
        System.out.print("Do you want to confirm the cancellation? (y/n): ");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("y")) {

            System.out.println("Cancellation successful!");
        } else {
            System.out.println("Cancellation not confirmed.");
        }

        scanner.close();
    }

    private static boolean isValidUser(String loginId, String password) {
        String storedPassword = users.get(loginId);
        return storedPassword != null && storedPassword.equals(password);
    }
}
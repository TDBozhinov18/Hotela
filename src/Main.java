import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        int choose;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Guests> Guests = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("1. Insert info");
            System.out.println("2. Print info");
            System.out.println("3. Print names and price of particular city");
            System.out.println("4. Exit");
            System.out.print("Choose an option: "); choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println();
                    Guests.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(Guests);
                    break;
                case 3:
                    System.out.println();
                    printGuestsFromParticularCity(Guests, scanner);
                    break;
                case 4: exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void printData(ArrayList<Guests> Guests) {
        System.out.println("Print all data!");
        for (Guests h : Guests) {
            System.out.println(h.toString());
        }
    }

    public static Guests insertData(Scanner scanner) {

        String nothing = scanner.nextLine();
        String name;
        String egn;
        int martialStatus;
        int nights;
        double beds;
        String city;

        System.out.println("Insert data!");
        System.out.print("Name: "); name = scanner.nextLine();
        System.out.print("EGN: "); egn = scanner.nextLine();
        System.out.print("Martial Status 1 for engaged or 2 for single: "); martialStatus = scanner.nextInt();
        System.out.print("Nights: "); nights = scanner.nextInt();
        System.out.print("Price for beds: "); beds = scanner.nextInt();
        String nothing1 = scanner.nextLine();
        System.out.print("City: "); city = scanner.nextLine();

        return new Guests(name, egn, martialStatus, nights, beds, city);
    }

    public static void printGuestsFromParticularCity(ArrayList<Guests> Guests, Scanner sc) {

        int totalPrice = 0;
        ArrayList<Guests> newStudents = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();

        for (Guests h : Guests) {
            if(h.city.equals(city)) {
                newStudents.add(h);
                totalPrice += h.beds;
            }
        }

        System.out.println();
        for (Guests h : newStudents) {
            System.out.println("Guest name: " + h.name);
        }

        System.out.println("Total price for beds of the beds: " + totalPrice);
    }
}
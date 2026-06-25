import java.util.Scanner;

public class ThermoFlip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== TEMPERATURE CONVERTER =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Choose an option (1 or 2): ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();

                    double fahrenheit = (celsius * 9 / 5) + 32;

                    System.out.printf("%.2f °C = %.2f °F%n",
                            celsius, fahrenheit);
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahr = sc.nextDouble();

                    double cel = (fahr - 32) * 5 / 9;

                    System.out.printf("%.2f °F = %.2f °C%n",
                            fahr, cel);
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1 or 2.");
            }

            System.out.print("\nDo you want to convert another temperature? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for using Temperature Converter!");
        sc.close();
    }
}
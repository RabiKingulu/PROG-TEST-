import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the console type:");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "Unknown Console";
                break;
        }

        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        System.out.print("Enter the total sales of console: ");
        int totalSales = scanner.nextInt();

        System.out.println(); 

        
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();

        scanner.close();
    }
}

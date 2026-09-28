public class Main{
    public static void main(String[]args) {

        String[] city = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] gamingConsoles = {"PS5", "Xbox", "Switch"};
        int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

        System.out.println("----------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%-8s%n", "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < city.length; i++) {
            System.out.printf("%-20s", city[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-15d", sales[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------");

        int total = 0;
        String totalCity = "";

        for (int i = 0; i < city.length; i++) {
            int sum = sales[i][0] + sales[i][1] + sales[i][2];

            System.out.printf("%-20s%-15d%n", city[i], sum);
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: PORT ELIZABETH");
    }
}

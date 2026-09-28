public class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleDeviceType, String consoleName, int totalSales){
        super(consoleDeviceType,consoleName,totalSales);
    }
    public void printReport(){
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("2) SWITCH");
        System.out.println("Enter the store:");
        System.out.println("Enter the total sales of beverage:");
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*********************");
        System.out.println("CONSOLE TYPE :"+ getConsoleDeviceType());
        System.out.println("STORE:"+getStore());
        System.out.println("TOTAL SALES :" + getTotalSales());
    }

}

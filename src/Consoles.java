public abstract class Consoles implements IConsole {
    private String consoleDeviceType;
    private int totalSales;
    private String store;
    public Consoles(String consoleDeviceType, String consoleName, int totalSales){
        this.consoleDeviceType=consoleDeviceType;
        this.totalSales=totalSales;
    }

    public String getConsoleDeviceType() {
        return consoleDeviceType;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
    public String getStore() {
        return store;
}

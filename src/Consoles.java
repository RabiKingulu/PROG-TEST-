public abstract class Consoles implements IConsole {
    private String consoleDeviceType;
    private String consoleName;
    private int totalSales;
    private String store;
    public Consoles(String consoleDeviceType, String consoleName, int totalSales){
        this.consoleDeviceType=consoleDeviceType;
        this.consoleName=consoleName;
        this.totalSales=totalSales;
    }

    public String getConsoleDeviceType() {
        return consoleDeviceType;
    }

    public String getConsoleName() {
        return consoleName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
    public String getStore() {
        return store;
}

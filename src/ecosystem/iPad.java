public class iPad implements AppleDevice {
    private String deviceName;
    private String model;
    private int storage;
    protected iPad() {
        this("iPad", "Air", 64);
    }
    protected iPad(String deviceName, String model, int storage) {
        this.deviceName = deviceName;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public void connectToWifi() {
        System.out.println(deviceName + " " + model + " is connecting to WiFi...");
    }

    @Override
    public void sendData(String data) {
        System.out.println(deviceName + " " + model + " is sending '" + data + "'");
    }

    @Override
    public void receiveData() {
        System.out.println(" to " + deviceName + " " + model);
    }

    @Override
    public String toString() {
        return deviceName + " " + model + " with storage capacity " + storage + "GB.";
    }
}

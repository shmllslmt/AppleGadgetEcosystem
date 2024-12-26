package ecosystem;

/**
 * This class has three attributes, which are deviceName, model and storage
 */
public class iPhone implements AppleDevice {
    private String deviceName;
    private String model;
    private int storage;

    /**
     * This is a no-arg constructor
     */
    protected iPhone() {
        this("ecosystem.iPhone", "SE", 64);
    }

    /**
     * This is a parameterized constructor
     * @param deviceName refers to the name of the device such as "iPhone"
     * @param model refers to the model of the device such as "SE"
     * @param storage refers to the storage capacity of the device such as 64, which is referring to 64GB
     */
    protected iPhone(String deviceName, String model, int storage) {
        this.deviceName = deviceName;
        this.model = model;
        this.storage = storage;
    }

    /**
     * This method overrides the AppleDevice interface method
     */
    @Override
    public void connectToWifi() {
        System.out.println(deviceName + " " + model + " is connecting to WiFi...");
    }

    /**
     * This method overrides the AppleDevice interface method
     * @param data refers to the data that is being sent
     */
    @Override
    public void sendData(String data) {
        System.out.println(deviceName + " " + model + " is sending '" + data + "'");
    }

    /**
     * This method overrides the AppleDevice interface method
     */
    @Override
    public void receiveData() {
        System.out.println(" to " + deviceName + " " + model);
    }

    /**
     * @return the device information such as the device name, model and storage capacity
     */
    @Override
    public String toString() {
        return deviceName + " " + model + " with storage capacity " + storage + "GB.";
    }
}

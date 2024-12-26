package ecosystem;

public interface AppleDevice {
    /**
     * This method displays the device that is currently connecting to Wi-Fi
     */
    void connectToWifi();

    /**
     * This method displays the device that is sending a data and data that is being sent
     * @param data refers to the data that is being sent
     */
    void sendData(String data);

    /**
     * This method displays the device that receives data
     */
    void receiveData();
}

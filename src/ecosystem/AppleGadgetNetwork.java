package ecosystem;

import java.util.ArrayList;

public class AppleGadgetNetwork {
    private ArrayList<AppleDevice> devices;
    protected AppleGadgetNetwork() {
        devices = new ArrayList<>();
    }
    public void addDevice(AppleDevice device) {
        devices.add(device);
    }

    /**
     * @param sender - apple devices
     * @param receiver
     * @param data
     */
    public void sendData(AppleDevice sender, AppleDevice receiver, String data) {
        sender.sendData(data);
        receiver.receiveData();
    }

    /**
     *
     */
    public void displayDevices() {
        if(!(devices.isEmpty())) {
            for(AppleDevice device: devices) {
                System.out.println(device);
            }
        }
    }
}

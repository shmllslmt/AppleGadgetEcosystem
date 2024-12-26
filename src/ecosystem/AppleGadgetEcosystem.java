package ecosystem;

/**
 * gg
 */

public class AppleGadgetEcosystem {
    public static void main(String[] args) {
        iPhone iphone = new iPhone("ecosystem.iPhone", "14 Pro Max", 512);
        iPad ipad = new iPad();
        Macbook macbook = new Macbook("ecosystem.Macbook", "Air", 256);

        AppleGadgetNetwork network = new AppleGadgetNetwork();
        network.addDevice(iphone);
        network.addDevice(ipad);
        network.addDevice(macbook);

        network.sendData(iphone, ipad, "I have a Final Exam on 7 September 2023");

        System.out.println("\nThe devices that are currently connected in the network are:");
        network.displayDevices();
    }
}
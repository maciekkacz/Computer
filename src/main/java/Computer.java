import drive.Drive;
import usbdevice.USBDivace;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

     private  List<USBDivace> usbDivaces = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public Computer() {
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDivace> getUsbDivaces() {
        return usbDivaces;
    }

    public void setUSBbDivaces(List<USBDivace> usbDivaces) {
        this.usbDivaces = usbDivaces;
    }
    public void addDicace(USBDivace usbDivace) {
        boolean isConnected = usbDivace.connect();
        if (isConnected){
            usbDivaces.add(usbDivace);
        }

    }
    public void removeUSB(USBDivace usbDivace){
        boolean isDisconnect = usbDivace.disconnect();
        if (isDisconnect){
            usbDivaces.add(usbDivace);
        }
       
    }
}

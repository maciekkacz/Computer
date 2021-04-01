import drive.Drive;
import drive.HDDDrive;
import drive.SSDDrive;
import usbdevice.MemoryStick;
import usbdevice.Mouse;
import usbdevice.USBDivace;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Drive drive = new HDDDrive();
//        Drive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("name.jpg"));
//        drive.listFiles();

        Mouse mouse = new Mouse("Mysz");
        MemoryStick memoryStick = new MemoryStick("Pendrive");

        computer.addDicace(mouse);
        computer.addDicace(memoryStick);

        memoryStick.eject();

        computer.removeUSB(mouse);
        computer.removeUSB(memoryStick);




    }
}

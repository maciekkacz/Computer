import drive.Drive;
import drive.HDDDrive;
import drive.SSDDrive;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Drive drive = new HDDDrive();
//        Drive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("name.jpg"));
        drive.listFiles();
    }
}

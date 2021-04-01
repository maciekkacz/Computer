package usbdevice;

public interface USBDivace {

    boolean connect();
    boolean disconnect();
    String getName();
}

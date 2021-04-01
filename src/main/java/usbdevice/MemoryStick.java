package usbdevice;

public class MemoryStick implements USBDivace {
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    public void eject(){
        System.out.println("Ejected Memory Stick");
        ejected = true;
    }

    @Override
    public boolean connect() {
        System.out.println("Memory connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected){
            System.out.println("Please eject Memory first");
            return false;
        }
        else 
        System.out.println("Memory disconnected");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}

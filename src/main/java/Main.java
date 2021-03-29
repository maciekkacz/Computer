public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        String resolution = monitor.getResolution();
        System.out.println(resolution);
        monitor.setLowResolution();
        System.out.println(monitor.getResolution());
        monitor.serHightResolution();
        System.out.println(monitor.getResolution());
    }
}

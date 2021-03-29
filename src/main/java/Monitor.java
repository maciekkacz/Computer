public class Monitor {
    private int width = 3840;
    private int height = 1920;

    public void setLowResolution() {
        width = 880;
        height = 600;
    }

    public void serHightResolution(){
        width = 3840;
        height = 1920;
    }

    public String getResolution(){
        return width + " " + height;
    }
}

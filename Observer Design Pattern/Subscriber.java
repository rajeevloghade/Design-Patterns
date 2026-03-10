public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String videoTitle) {
        System.out.println("\"" + name + "\"" + " has been notified about new video: " + videoTitle);
    }
}

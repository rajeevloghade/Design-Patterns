import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subscriber = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscriber.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscriber.remove(observer);
    }

    @Override
    public void newVideoUploaded(String videoTitle) {
        System.out.println("\n" + "New video uploaded: " + videoTitle + "\n");
        if(subscriber.isEmpty()) {
            System.out.println("No subscribers to notify.");
            return;
        }
        for (Observer observer : subscriber) {
            observer.notified(videoTitle);
        }
    }
}

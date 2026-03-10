public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("John");
        Subscriber subscriber2 = new Subscriber("Alice");
        Subscriber subscriber3 = new Subscriber("Bob");

        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.subscribe(subscriber3);

        youtubeChannel.newVideoUploaded("Observer Design Pattern in Java");

        youtubeChannel.unsubscribe(subscriber2);
        youtubeChannel.unsubscribe(subscriber1);
        youtubeChannel.unsubscribe(subscriber3);

        youtubeChannel.newVideoUploaded("Observer Design Pattern Explained");
    }
}

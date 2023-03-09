package week5.observer;

// Observer, when you are interested in the state of an object and want to get notified
// whenever there is a change

// Subject is the topic which you want to subscribe on.
// it maintains a list of its observers/subscribers.
// Subject notifies them automatically of any state changes

public interface Observer {
    void update(String msg);
}

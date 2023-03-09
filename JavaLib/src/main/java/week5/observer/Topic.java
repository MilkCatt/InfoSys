package week5.observer;

import java.util.ArrayList;

// Concrete Subject - implements subject interface
public class Topic implements Subject {
    private String message;  // the status
    private ArrayList<Observer> observers;  // stores all the observers of this topic

    // Constructor
    public Topic (){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObservers() { // call.update when passing the message
        for (Observer o: observers)
            o.update(this.message);
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }   // adds o to list

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }   //removes o from list

    public void postMessage(String msg) {   // changes message attribute then notifies observers
        message = msg;
        notifyObservers();
    }
}

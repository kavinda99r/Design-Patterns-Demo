/*
============================================================
Behavioral Design Pattern - Observer
============================================================
 */

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void changeState(String message) {
        notifyObservers(message);
    }
}

class NewsReader implements Observer {
    @Override
    public void update(String message) {
        System.out.println("NewsReader: " + message);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Subject newsAgency = new Subject();
        Observer reader1 = new NewsReader();
        Observer reader2 = new NewsReader();

        newsAgency.addObserver(reader1);
        newsAgency.addObserver(reader2);

        newsAgency.changeState("Breaking news!");
    }
}

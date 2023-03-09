package week5.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Topic infoSys = new Topic();

        Subscriber s1 = new Subscriber("Mike", infoSys);
        Subscriber s2 = new Subscriber("Sonya", infoSys);

        infoSys.postMessage("Mock test tomorrow!");
        infoSys.unregister(s1);
        System.out.println();

        infoSys.postMessage("No class next week!");
    }
}

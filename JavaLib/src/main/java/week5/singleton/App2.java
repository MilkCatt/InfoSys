package week5.singleton;

// Singleton ensures that a class has only 1 instance and global access to it
public class App2 {
    private LogFile log = LogFile.getInstance();

    App2() {
        System.out.println( "App2 is created: " + log );
    }

    public void doSomething(String something) {
        log.INFO(something + " happen.");
    }

}
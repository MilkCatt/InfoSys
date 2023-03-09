package week5.singleton;

public class App1 {
    private LogFile log = LogFile.getInstance();
    // when calling this, it will only create a new logfile instance if one doesn't exist

    App1() {
        System.out.println( "App1 is created: " + log );
    }

    public void registerUser(String username){
        log.INFO(username + " is registered");
    }
}

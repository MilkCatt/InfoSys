package week5.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        App1 a1 = new App1();
        App2 a2 = new App2();

        // Some activities in the program
        a1.registerUser("Norman");
        a1.registerUser("Fredy");
        a2.doSomething("Norman deletes a post");

        // Print everything inside log
        LogFile.getInstance().printLog();

    }
}

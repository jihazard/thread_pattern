package singlethreadexecution.gate;

public class Main {
    public static void main(String[] args) {
        System.out.println("test gate hit ctro c _ exit");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();


    }
}

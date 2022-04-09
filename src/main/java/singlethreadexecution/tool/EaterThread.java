package singlethreadexecution.tool;

public class EaterThread extends Thread{
    private String name;
    private final Tool lefthand;
    private final Tool righthand;

    public EaterThread(String name, Tool left, Tool right) {
        this.name= name;
        this.lefthand = left;
        this.righthand = right;
    }

    @Override
    public void run() {
        while(true){
            eat();
        }
    }

    public  void eat() {
        synchronized (this) {
            System.out.println(name + " take up " + lefthand +" (left).");

                System.out.println(name + " take up " + righthand +" (right).");
                System.out.println(name + " is eating now, yam yanm ");
                System.out.println(name + " put down  "  + righthand + "(right.)");

            System.out.println(name + " puts down " + lefthand);
        }
    }
}

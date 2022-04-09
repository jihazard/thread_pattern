package singlethreadexecution;

public class UserThread extends Thread{
    private final Gate gate;
    private final String myname;
    private final String myaddress;
    public UserThread(Gate gate, String name, String address) {
        this.gate = gate;
        this.myaddress = address;
        this.myname = name;
    }

    @Override
    public void run() {
        System.out.println(myname + " begin ");
        while(true) {
            gate.pass(myname, myaddress);
        }
    }
}

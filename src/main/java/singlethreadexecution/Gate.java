package singlethreadexecution;

public class Gate {
    private int counter =0;
    private String name = "nobody";
    private String address ="nowhere";

    public void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    private void check() {
        if(name.charAt(0) != address.charAt(0)) {
            System.out.println("broken ************* "+ toString());
        }
    }

    public String toString() {
        return "NO : " + counter + " : " + name + ", " + address;
    }

}

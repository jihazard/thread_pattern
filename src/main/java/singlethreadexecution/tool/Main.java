package singlethreadexecution.tool;

public class Main {
    public static void main(String[] args) {
        System.out.println(" eat thread");

        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");

        new EaterThread("Alice", spoon, fork).start();
        new EaterThread("Bobby", fork, spoon).start();


    }
}

package Homework1;

public class Human implements Participant{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name,int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int run() {
        return runDistance;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " participant " + getName();
    }

    public String getName() {
        return name;
    }
}

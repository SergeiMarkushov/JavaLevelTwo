package Homework1;

public class Robot implements Participant{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name,int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " participant " + getName();
    }

    @Override
    public int run() {
        return runDistance;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }

    public String getName() {
        return name;
    }
}


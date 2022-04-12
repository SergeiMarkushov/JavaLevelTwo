package Homework1;

public class Robot implements Participant{
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean isPath;

    public Robot(String name,int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.isPath=true;

    }

    @Override
    public boolean getPath() {
        return isPath;
    }

    public void setPath(boolean path) {
        this.isPath = path;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " participant " + getName();
    }

    @Override
    public void run(int distance) {
        if(distance<=runDistance){
            System.out.println("Robot " + getName() + " path the distance " + distance);
        }else{
            setPath(false);
            System.out.println("Robot " + getName() + " don't path the distance " + distance + " and out of the race");
        }
    }

    @Override
    public void jump(int height) {
        if(height<=jumpHeight){
            System.out.println("Robot " + getName() + " path the height " + height);
        }else{
            setPath(false);
            System.out.println("Robot " + getName() + " don't path the height " + height + " and out of the race");
        }
    }

    public String getName() {
        return name;
    }
}


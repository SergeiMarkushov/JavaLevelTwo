package Homework1;

public class Cat implements Participant{
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean isPath;

    public Cat(String name,int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.isPath=true;
    }

    public void setPath(boolean path) {
        this.isPath = path;
    }

    @Override
    public boolean getPath() {
        return isPath;
    }

    @Override
    public void run(int distance) {
        if(distance<=runDistance){
            System.out.println("Cat " + getName() + " path the distance " + distance);
        }else{
            setPath(false);
            System.out.println("Cat " + getName() + " don't path the distance " + distance + " and out of the race");
        }
    }

    @Override
    public void jump(int height) {
        if(height<=jumpHeight){
            System.out.println("Cat " + getName() + " path the height " + height);
        }else{
            setPath(false);
            System.out.println("Cat " + getName() + " don't path the height " + height + " and out of the race");
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " participant " + getName();
    }

    public String getName() {
        return name;
    }
}


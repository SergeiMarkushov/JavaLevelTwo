package Homework1_1;

public class Cat implements Runs, Jumps, Sportsmen{
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean isGot;

    public void setGot(boolean got) {
        this.isGot = got;
    }
    public boolean getIsGot(){
        return  this.isGot;
    }

    public Cat (String name, int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        setGot(true);
    }

    @Override
    public void jump(int height) {
        if (height<= jumpHeight){
            System.out.println("Cat " + name + " path the height " + height);
        }else{
            System.out.println("Cat " + name + " can't path the height " + height + " and is out of the race!");
            setGot(false);
        }
    }

    @Override
    public void run(int distance) {
        if (distance<= runDistance){
            System.out.println("Cat " + name + " path the distance " + distance);
        }else{
            System.out.println("Cat " + name + " can't path the distance " + distance + " and is out of the race!");
            setGot(false);
        }
    }
}

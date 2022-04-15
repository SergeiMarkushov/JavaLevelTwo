package Homework1_1;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height){
        this.height = height;
    }

    public void canDoIt(Jumps subject){
        subject.jump(height);
    }
}

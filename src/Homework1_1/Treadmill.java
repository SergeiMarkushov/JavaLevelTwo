package Homework1_1;

public class Treadmill implements Obstacles{
    private int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    public void canDoIt(Runs subject){
        subject.run(distance);
    }

}

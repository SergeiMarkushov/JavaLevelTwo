package Homework1;

public class Treadmill implements Obstacles {

    private int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(distance);
    }

    public int getDistance() {
        return distance;
    }
}

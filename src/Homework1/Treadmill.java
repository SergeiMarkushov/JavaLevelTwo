package Homework1;

public class Treadmill implements Obstacles {

    private int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
            if(participant.run()>=distance){
                System.out.println(participant.toString() + " runs the distance " + getDistance());
            }else{
                System.out.println(participant.toString() + " can't run the distance " + getDistance());
            }
    }

    public int getDistance() {
        return distance;
    }
}

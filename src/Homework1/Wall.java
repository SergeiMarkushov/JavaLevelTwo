package Homework1;

public class Wall implements Obstacles{

    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
            if(participant.jump()>=height){
                System.out.println(participant.toString() + " get the height " + getHeight());
            }else{
                System.out.println(participant.toString() + " can't jump so height " + getHeight());
            }
    }

    public int getHeight() {
        return height;
    }
}

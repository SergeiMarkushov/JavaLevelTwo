package Homework1;

public class Wall implements Obstacles{

    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(height);
    }

    public int getHeight() {
        return height;
    }
}

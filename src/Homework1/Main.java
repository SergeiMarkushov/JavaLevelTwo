package Homework1;

public class Main {
    public static void main(String[] args) {
        Participant[] participant =
                {
                        new Human("Jake", 300, 5),
                        new Human("Don", 100, 3),
                        new Human("Jhon", 300, 2),

                        new Robot("G540", 540, 50),
                        new Robot("G250", 250, 50),
                        new Robot("G100", 100, 2),

                        new Cat("Barsic", 300, 5),
                        new Cat("Snowball", 300, 2),
                        new Cat("Old", 100, 2)
                };

        Obstacles[] obstacles =
                {
                        new Treadmill(100),
                        new Wall(1),
                        new Treadmill(200),
                        new Wall(3),
                        new Treadmill(301),
                        new Wall(6)
                };

        marathone(participant,obstacles);

    }
    public static void marathone(Participant[] participants, Obstacles[] obstacles){
        for (Participant participant : participants) {
            for (Obstacles obstacle : obstacles) {
                obstacle.overcome(participant);
            }
            System.out.println();
        }
    }
}
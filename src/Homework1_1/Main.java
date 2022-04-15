package Homework1_1;

public class Main {
    public static void main(String[] args) {
        Sportsmen[] sportsmen =
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

        marathon(sportsmen,obstacles);

    }

    public static void marathon(Sportsmen[] sportsmen, Obstacles[] obstacles){
        for (Obstacles obstacle : obstacles) {
            for (Sportsmen sportsman : sportsmen) {
                if(sportsman instanceof Human){
                    if (!((Human) sportsman).getIsGot()){
                        continue;
                    }
                }
                if(sportsman instanceof Robot){
                    if(!((Robot) sportsman).getIsGot()){
                        continue;
                    }
                }
                if(sportsman instanceof Cat){
                    if(!((Cat) sportsman).getIsGot()){
                        continue;
                    }
                }
                if(obstacle instanceof Wall && sportsman instanceof Jumps){
                    ((Wall) obstacle).canDoIt((Jumps) sportsman);
                }
                if(obstacle instanceof Treadmill && sportsman instanceof Runs){
                    ((Treadmill) obstacle).canDoIt((Runs)sportsman);
                }
            }
            System.out.println();
        }
    }
}

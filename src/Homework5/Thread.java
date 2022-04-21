package Homework5;

public class Thread implements Runnable {


    @Override
    public void run() {

    }


    public void count(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5.0f) * Math.cos(0.2f + i / 5.0f) *
                    Math.cos(0.4f + i / 2.0f));
        }
    }
}

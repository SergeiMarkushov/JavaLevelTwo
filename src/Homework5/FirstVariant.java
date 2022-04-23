package Homework5;

public class FirstVariant {
    private static final int SIZE = 10_000_000;
    private static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1.0f;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5.0f) * Math.cos(0.2f + i / 5.0f) *
                    Math.cos(0.4f + i / 2.0f));
        }
        long stop = System.currentTimeMillis();
        System.out.println("One thread time " + (stop - start) + " ms.");
    }

    public static void secondMethod() {

        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1.0f;
        }
        long start = System.currentTimeMillis();
        float[] leftHalf = new float [HALF];
        float[] rightHalf = new float [HALF];
        System.arraycopy(array, 0, leftHalf, 0, HALF);
        System.arraycopy(array, HALF, rightHalf, 0, HALF);

        java.lang.Thread thread1 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < leftHalf.length; i++) {
                    leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5.0f) * Math.cos(0.2f + i / 5.0f) *
                            Math.cos(0.4f + i / 2.0f));
                }
            }
        });
        java.lang.Thread thread2 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < rightHalf.length; i++) {
                    rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5.0f) * Math.cos(0.2f + i / 5.0f) *
                            Math.cos(0.4f + i / 2.0f));
                }
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        float[] mergedArray = new float [SIZE];
        System.arraycopy(leftHalf, 0, mergedArray, 0, HALF);
        System.arraycopy(rightHalf, 0, mergedArray, HALF, HALF);

        long stop = System.currentTimeMillis();

        System.out.println("Two thread time: " + (stop - start) + " ms.");
    }
}
/*вывод:
        One thread time 1908 ms.
        Two thread time: 800 ms.*/


package Homework2;

public class MyArrayDataException extends RuntimeException{
    private final int I;
    private final int J;

    public MyArrayDataException(int i, int j){
        this.I = i;
        this.J = j;
        System.out.printf("Wrong data type in index array[%d][%d]", getI(), getJ());
    }

    public int getI() {
        return I;
    }

    public int getJ() {
        return J;
    }
}

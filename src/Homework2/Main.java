package Homework2;

public class Main {
    public static void main(String[] args) {
        String[][] array1 =
                 {
                         {"1","2","3","4"},
                         {"2","3","4","5"},
                         {"3","4","5","6"},
                         {"4","5","6","7"}
                 };                                 // верный массив

        String[][] array2 =
                {
                        {"1","q","3","4"}, // q - вместо цифры для вызова ошибки
                        {"2","3","4","5"},
                        {"3","4","5","6"},
                        {"4","5","6","7"}
                };

        String[][] array3 =
                {
                        {"1","2","3","4"},
                        {"2","3","4","5"},
                        {"3","4","5","6"},
                        {"4","5","6","7"},
                        {"4","5","6","7"} // лишнее для вызова ошибки
                };

        try{
            myArray(array1);        // для проверки работы
            myArray(array2);        // исключений
            myArray(array3);        // закомментируйте два метода
        }catch (MyArraySizeException | MyArrayDataException e){
            //noinspection ResultOfMethodCallIgnored
            e.getMessage();
        }
    }



   public static void myArray(String [][] array) throws MyArrayDataException, MyArraySizeException{

        int sum = 0;

        if(array.length !=4){
    throw new MyArraySizeException();
       }

       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               if (array[j].length !=4){
                   throw new MyArraySizeException();
               }

               try{
                   sum += Integer.parseInt(array[i][j]);
               }catch (NumberFormatException e){
                   throw new MyArrayDataException(i,j);
               }
           }
       }
       System.out.println("Sum of indexes of array = " + sum);
   }
}

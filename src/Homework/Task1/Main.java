package Homework.Task1;

//Написать метод, возвращающий количество чётных элементов массива.
//countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3
//countEvens([1, 3, 5]) → 0

public class Main {
    public static int countEvens(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }
}

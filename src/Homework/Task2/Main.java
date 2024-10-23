package Homework.Task2;

//Написать функцию, возвращающую разницу между самым большим и
//самым маленьким элементами переданного не пустого массива.

public class Main {
    public static int diffValues(int[] array){
        if (array.length <= 1) return 0;

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4, 8, 9, 3, 0};
        System.out.println(diffValues(array));
    }
}

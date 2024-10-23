package Homework.Task3;

//Написать функцию, возвращающую истину, если в переданном массиве
//есть два соседних элемента, с нулевым значением.

public class Main {
    public static boolean findNeighbours(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                if (array[i + 1] == 0) {
                    return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 0, 1, 9, 5, 0};
        System.out.println(findNeighbours(array));
    }
}

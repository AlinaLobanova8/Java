package Java.lesson_1.HW;

import java.util.Arrays;
import java.util.Scanner;

public class HW_4 {
    /*
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int num = scan.nextInt();

        int[][] array = new int[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j | j == num - i - 1)
                    array[i][j] = 1;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

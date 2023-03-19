package Java.lesson_1.HW;

import java.util.Arrays;

public class HW_3 {
    /*
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void main(String[] args) {
        int[] ints = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 6)
                ints[i] = ints[i] * 2;
        }
        System.out.println(Arrays.toString(ints));
    }
}

package Java.lesson_1.HW;

import java.util.Arrays;

public class HW_2 {
    public static void main(String[] args) {
        int[] ints = new int[] {1, 0, 1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0)
                ints[i] = 1;
            else
                ints[i] = 0;
        }
        System.out.println(Arrays.toString(ints));
    }
}

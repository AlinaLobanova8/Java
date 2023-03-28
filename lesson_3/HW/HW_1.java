package Java.lesson_3.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_1 {
    // Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 89, 2, 14, 34, 78, 23, 44, 100, 5 ,3, 56, 6, 9, 11, 200));
        evenNumbers(integers);
        System.out.println(integers);
    }
    private static void evenNumbers(List<Integer> source) {
        int i = 0;
        while (i < source.size()) {

            if (source.get(i) % 2 != 0) {
                source.remove(i--);
            }
            i++;
        }
    }
}

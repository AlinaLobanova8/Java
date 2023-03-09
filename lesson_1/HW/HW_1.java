package Java.lesson_1.HW;

public class HW_1 {
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, 
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int summ = a + b;
        return summ >= 10 && summ <= 20;
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }
    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }
}
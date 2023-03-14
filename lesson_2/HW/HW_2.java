package Java.lesson_2.HW;

import java.io.File;
import java.io.PrintWriter;

public class HW_2 {
    // Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
    public static void main(String[] args) {
        File file = new File("file.txt");
        PrintWriter text = new PrintWriter(file);
        text.println("TEXT".repeat(100));
        text.close();
    }
}

package by.verameichyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 7");
        int n = Integer.parseInt(reader.readLine());
        switch (n) {
            case (1) -> System.out.println("Понедельник " + n + "-й день недели");
            case (2) -> System.out.println("Вторник " + n + "-й день недели");
            case (3) -> System.out.println("Среда " + n + "-й день недели");
            case (4) -> System.out.println("Четверг " + n + "-й день недели");
            case (5) -> System.out.println("Пятница " + n + "-й день недели");
            case (6) -> System.out.println("Суббота " + n + "-й день недели");
            case (7) -> System.out.println("Воскресение " + n + "-й день недели");
            default -> System.out.println("Неверно введено число");
        }
    }
}


/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = scanner.nextDouble();
        double percent = scanner.nextDouble();


        for (int i = 1; i < 6; i++) {
            deposit = deposit + deposit / 100 * percent;
            System.out.println("Сумма вклада на " + i + " год равна: " + deposit);
        }

    }
}

/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int[] numbers = new int[10];
        int count_1 = 1;
        int count_2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел 10 целых чисел: \n");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            System.out.print(" " + numbers[i]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count_1++;

            } else if (count_1 > count_2) {
                count_2 = count_1;
                count_1 = 1;
            } else {
                count_1 = 1;
            }
        }
        if (count_1 > count_2) {
            System.out.println("\nСамая длинная последовательность повторяющихся чисел: " + count_1);
        } else {
            System.out.println("\nСамая длинная последовательность повторяющихся чисел: " + count_2);
        }

    }
}

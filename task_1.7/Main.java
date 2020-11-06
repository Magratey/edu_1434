
/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int length, width, height, volume;

        Scanner enteredValue = new Scanner(System.in);

        length = enteredValue.nextInt();
        width = enteredValue.nextInt();
        height = enteredValue.nextInt();

        volume = length * width * height * 1000;

        System.out.println(volume);


    }
}

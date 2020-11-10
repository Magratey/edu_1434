/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        int mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            mult *= numbers[i];

        }
        System.out.println(mult);


    }
}

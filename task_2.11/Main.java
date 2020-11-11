/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
 чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 3};
        int sum = 0;
        int i = 0;
        while (sum <= 10) {
            sum += numbers[i];
            i++;
            if (i == numbers.length && sum <= 10) {
                System.out.println("Сумма всех числе массива меньше 10");
                break;
            }


        }
        if (sum > 10) {
            System.out.println(i);
        }
    }
}

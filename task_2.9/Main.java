/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 6, 4};
        int check = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                System.out.println("да");
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("нет");
        }
    }
}

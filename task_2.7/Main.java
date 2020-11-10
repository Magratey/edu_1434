/*

Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.

*/
public class Main {
    public static void main(String[] args) {
        int a = 31;
        int check = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(true);
                check = 1;
                break;

            }


        }
        if (check == 0) {
            System.out.println(false);

        }
    }
}

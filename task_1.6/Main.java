import java.util.Scanner;
/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

public class Main {
    public static void main(String[] args) {
        double number;

        Scanner enterNumber = new Scanner(System.in);

        number = enterNumber.nextDouble();

        number *= 1.15;

        System.out.println(number);
    }
}

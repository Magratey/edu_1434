/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Main {
    public static void main(String[] args) {
        String eight = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(eight);
            eight += 8;

        }

    }
}
/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию
и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65, 3, 5, 6, 6};
        outArrray(num, 0);
    }


    public static void outArrray(int[] array, int a) {
        if (a < array.length) {
            System.out.print(" " + array[a]);
            a++;
            outArrray(array, a);
        }
    }


}

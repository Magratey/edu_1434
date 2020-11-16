/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        ArrayList<Integer> numsNew = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(22);
        nums.add(21);
        nums.add(5);
        nums.add(0);
        nums.add(29);
        nums.add(8);
        nums.add(8);
        nums.add(9);
        nums.add(82);
        nums.add(10);

        while (i < nums.size()) {
            if (nums.get(i) > 0 && nums.get(i) < 10) {
                numsNew.add(nums.get(i));
                i++;
            } else  {
                i++;
            }
        }

        System.out.println(numsNew);
    }
}

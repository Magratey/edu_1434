/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу с целыми числами, расположенными в строку через пробел: \n");
         String path = scanner.nextLine();
        try {
            FileReader reader = new FileReader(path);
            int c;
            String strNums = "";


            while ((c = reader.read()) != -1) {

                strNums += (char) c;
            }
            String[] arrayStrNums = strNums.split(" ");
            
            int[] nums = new int[arrayStrNums.length];

            for (int i = 0; i < arrayStrNums.length; i++) {
                nums[i] = Integer.parseInt(arrayStrNums[i]);
            }

            nums = intIncrem(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    System.out.print(" " + nums[i]);
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int[] intIncrem(int[] nums) {
        int b;
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                b = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = b;
                flag = true;
            }
        }
        if (flag) {
            intIncrem(nums);
        }
        return nums;
    }
}

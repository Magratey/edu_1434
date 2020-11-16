/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");


        checkAndDel(names);


        System.out.println(names);
    }

    public static ArrayList checkAndDel(ArrayList arrayList) {
        int i = 0;
        while (arrayList.indexOf(arrayList.get(i)) == arrayList.lastIndexOf(arrayList.get(i))) {
            if (i < arrayList.size()-1) {
                i++;
            } else break;

        }
        if (arrayList.indexOf(arrayList.get(i)) != arrayList.lastIndexOf(arrayList.get(i))) {
            arrayList.remove(arrayList.lastIndexOf(arrayList.get(i)));
            checkAndDel(arrayList);
        } 
        return arrayList;
    }

}

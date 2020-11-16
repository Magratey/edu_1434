/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listFamilies = new ArrayList<>();
        List<String> listSities = new ArrayList<>();
        while (true) {
            String sity = scanner.nextLine();
            String family = scanner.nextLine();
            if (sity.isEmpty() && family.isEmpty()) {
                break;
            }

            listFamilies.add(family);
            listSities.add(sity);
        }
        System.out.println("Введите город: ");

        String sityName = scanner.nextLine();

        if (listSities.indexOf(sityName) != -1) {
            String familyName = listFamilies.get(listSities.indexOf(sityName));
            System.out.println(familyName);
        } else {
            System.out.println("Нет такого города в списке.");
        }
    }
}

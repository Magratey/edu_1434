/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать
метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод
 public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse(7, "Гнедой", 3);
        Pegas pegas = new Pegas(5, "Белый", 4);
        horse.run();
        pegas.fly();
    }
}

abstract class Animal {
    private int age;
    private String color;
    private int length;

    public Animal(int age, String color, int length) {
        this.age = age;
        this.color = color;
        this.length = length;
    }


}

class Horse extends Animal {
    public Horse(int age, String color, int length) {
        super(age, color, length);
    }

    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}

class Pegas extends Horse {
    public Pegas(int age, String color, int length) {
        super(age, color, length);
    }

    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }
}

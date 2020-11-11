/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших"
критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false
 - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно
 условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 11;
        barsik.weight = 11;
        barsik.strength = 11;

        Cat vasya = new Cat();
        vasya.age = 11;
        vasya.weight = 11;
        vasya.strength = 12;

        System.out.println(barsik.fight(vasya));
        System.out.println(vasya.fight(barsik));

    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int isAgeWin;
        int isWeightWin;
        int isStrengthWin;

        if (age < anotherCat.age) {
            isAgeWin = 0;
        } else if (age == anotherCat.age) {
            {
                isAgeWin = 1;
            }
        } else isAgeWin = 2;


        if (weight < anotherCat.weight) {
            isWeightWin = 0;
        } else if (weight== anotherCat.weight){
            isWeightWin = 1;
        } else {
            isWeightWin = 2;
        }

        if (strength < anotherCat.strength) {
            isStrengthWin = 0;
        } else if (strength== anotherCat.strength) {
            isStrengthWin = 1;
        } else {
            isStrengthWin = 2;
        }

        int sum = isStrengthWin + isAgeWin + isWeightWin;
        if (sum < 4) {
            return false;
        } else return true;
    }

}

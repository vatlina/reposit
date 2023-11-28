/*1. -Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
        -Вывести созданный массив на экран используя цикл for.
        -Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
        -Вывести измененный массив на экран используя цикл for.
        Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.*/

public class FruitsArrayExample {
    public static void main(String[] args) {
               String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

               System.out.println("Исходный массив:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

              fruits[0] = "Kiwi";

             System.out.println("\nМассив после замены:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
/*2. Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
        Задание можно выполнить непосредственно в методе main либо создать отдельный метод.*/

public class EvenElementsExample {
    public static void main(String[] args) {
               String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

               System.out.println("Четные элементы массива:");
        for (int i = 0; i < fruits.length; i++) {
                      if (i % 2 == 0) {
                System.out.println(fruits[i]);
            }
        }
    }
}
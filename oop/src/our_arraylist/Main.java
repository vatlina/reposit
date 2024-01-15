package our_arraylist;
public class Main {
    public static void main(String[] args) {
        OurArrayList<Integer> list = new OurArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
           System.out.println("Содержимое списка: " + list);
        System.out.println("Размер списка: " + list.size());
        System.out.println();
        System.out.println("Элемент списка по индексу 1: " + list.get(1));
           list.set(10, 1);
        System.out.println("Список после изменения значения элемента с индексом 1 на 10: " + list);
        System.out.println("Размер списка после изменений: " + list.size());
        System.out.println();
            list.remove(10);
        System.out.println("Измененный список после удаления элемента со значением 10: " + list);
        System.out.println("Размер списка после изменения: " + list.size());
    }
}
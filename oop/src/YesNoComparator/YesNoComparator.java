package YesNoComparator;
/*Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
        Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}.
        Протестировать.*/
import java.util.ArrayList;
import java.util.List;

public class YesNoComparator {

    public static List<String> compareLists(List<Integer> list1, List<Integer> list2) {
        List<String> result = new ArrayList<>();

        if (list1.size() != list2.size()) {
            System.out.println("Внимание: Списки должны иметь одинаковую длину");
            return result;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 2, 3, 8);

        List<String> result = compareLists(list1, list2);

        System.out.println(result);
    }
}
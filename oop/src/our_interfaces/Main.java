
package our_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

/*Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producable, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:
строка распечатывается в виде !строка!
возвращается строка "Hello World" */

    public static void main(String[] args) {

        //  используя наши интерфейсы написать такие лямбды:
        // 1. конкатинировать  a и b   и получить ab
        // 2.  если длина строки 3 вернуть true
        // 3.  если длина строки четная вернуть true  иначе false
        // 4. вернуть строку в верхнем регистре
        // 5. если длина строки 4 вернуть 4 звездочки иначе вернуть строку без изменений

       /* Переписать лямбда выражения из класса Main пакета our_interfaces (см.код) с использованием стандартных функциональных интерфейсов*/

        Concatable concatable = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable.concat(1, 3));

        Predicate<String> checkable = s -> s.length() == 3;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));

        System.out.println("checkable even");
        checkable = s -> s.length() % 2 == 0;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));

        Function<String, String> transformable = String::toUpperCase;
        System.out.println(transformable.apply("abcDe"));

        Function<String, String> transformable1 = s -> s.length() == 4 ? "****" : s;
        System.out.println(transformable1.apply("ab"));
        System.out.println(transformable1.apply("abcd"));

        Consumer<String> printable = s -> System.out.println("!" + s + "!");
        printable.accept("Hello");

        Supplier<String> producable = () -> "Hello World";
        System.out.println(producable.get());
    }
}
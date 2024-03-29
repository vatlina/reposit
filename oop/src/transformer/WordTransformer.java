package transformer;

/*Написать метод, принимающий строку, содержащую слова, разделенные пробелом и два функциональных интерфейса -
function/unary operator и предикату.
Метод должен предоставлять возможность реализации следующих действий:
        1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
    2. При длине слова = 4 изменить все буквы этого слова на строчные и вернуть измененную строку
    3. При длине слова = 5 изменить все буквы этого слова на звездочки и вернуть измененную строку
т.е. написать лямбду для каждого случая
public String transformer(String input, Predicate<?> predicate, Function<?,?>function)
aaa BBBB dDD eeEEe lll -> AAA BBBB DDD  eeEEe LLL
aaa BBBB dDD eeEEe lll -> aaa bbbb dDD eeEEe lll
aaa BBBB dDD eeEEe lll -> aaa BBBB dDD ***** lll
        Протестировать*/

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WordTransformer {

    public static String transformer(String input, Predicate<String> predicate, Function<String, String> function) {

        String[] words = input.split(" ");


        String transformed = Arrays.stream(words)
                .map(word -> predicate.test(word) ? function.apply(word) : word)
                .collect(Collectors.joining(" "));

        return transformed;
    }

    public static void main(String[] args) {

        String input = "aaa BBBB dDD eeEEe lll";


        Predicate<String> condition1 = word -> word.length() == 3;
        Predicate<String> condition2 = word -> word.length() == 4;
        Predicate<String> condition3 = word -> word.length() == 5;

        Function<String, String> action1 = String::toUpperCase;
        Function<String, String> action2 = String::toLowerCase;
        Function<String, String> action3 = word -> "*".repeat(word.length());


        String result1 = transformer(input, condition1, action1);
        String result2 = transformer(input, condition2, action2);
        String result3 = transformer(input, condition3, action3);


        System.out.println(result1);  // AAA BBBB DDD eeEEe LLL
        System.out.println(result2);  // aaa bbbb ddd eeEEe lll
        System.out.println(result3);  // aaa BBBB DDD ***** lll
    }
}
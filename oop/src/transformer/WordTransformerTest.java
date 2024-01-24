package transformer;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTransformerTest {

    @Test
    public void testTransformer() {
        // Входные данные
        String input = "aaa BBBB dDD eeEEe lll";

        // Условия и лямбды
        WordTransformer transformer = new WordTransformer();
        Predicate<String> condition1 = word -> word.length() == 3;
        Predicate<String> condition2 = word -> word.length() == 4;
        Predicate<String> condition3 = word -> word.length() == 5;

        Function<String, String> action1 = String::toUpperCase;
        Function<String, String> action2 = String::toLowerCase;
        Function<String, String> action3 = word -> "*".repeat(word.length());

        // Выполнение метода
        String result1 = WordTransformer.transformer(input, condition1, action1);
        String result2 = WordTransformer.transformer(input, condition2, action2);
        String result3 = WordTransformer.transformer(input, condition3, action3);

        // Проверка результатов
        assertEquals("AAA BBBB DDD eeEEe LLL", result1);
        assertEquals("aaa bbbb ddd eeEEe lll", result2);
        assertEquals("aaa BBBB DDD ***** lll", result3);
    }
}

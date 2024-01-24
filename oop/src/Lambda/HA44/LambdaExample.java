package Lambda.HA44;

/*Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producable, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

строка распечатывается в виде !строка!
возвращается строка "Hello World"*/

public class LambdaExample {

    public static void main(String[] args) {

        Printable printableLambda = s -> System.out.println("!" + s + "!");

        Producable producableLambda = () -> "Hello World";


        printableLambda.print("Print this");
        System.out.println(producableLambda.produce());
    }
}
package exam01;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Ex10 {
    public static void main(String[] args) {
        Consumer<String> func1 = System.out::println; // s -> System.out.println(s);
        func1.accept("가나다");

        UnaryOperator<String> func2 = String::toUpperCase; // s -> s.to UpperCase();
        System.out.println(func2.apply("abc"));

        BiPredicate<String, String> func3 = String::equals; // (s1, s2) -> s1.equals(s2);
        System.out.println(func3.test("가나다","가나다"));

        BiPredicate<String, String> func4 = (s1, s2) -> s2.equals(s1); // 이러면 위처럼 바꿔서 쓸 수 없다.

    }
}

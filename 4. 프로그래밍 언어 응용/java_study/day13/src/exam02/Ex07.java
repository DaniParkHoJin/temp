package exam02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");
        Collections.shuffle(names);
        System.out.println(names);

        String max = Collections.max(names); // 기본 정렬 후 가장 아래
        String min = Collections.min(names); // 기본 정렬 후 가장 위
        System.out.printf("max= %s, min= %s%n", max, min);
    }
}

package exam01;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> member = new TreeMap<>(Comparator.reverseOrder());
        member.put("user01", "사용자01");
        member.put("user02", "사용자02");
        member.put("user03", "사용자03");
        member.put("user04", "사용자04");
        member.put("user05", "사용자05");

        member.put("user03", "(수정)사용자03");
        member.remove("user03");

        String name = member.get("user03");
        System.out.println(name);

        String name2 = member.getOrDefault("user06", "없는 사용자");
        System.out.println(name2);

        Set<Map.Entry<String, String>> entries = member.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("key= %s, value = %s%n", key, value);
        }


    }
}

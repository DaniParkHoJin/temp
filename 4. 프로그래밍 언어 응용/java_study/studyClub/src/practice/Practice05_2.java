package practice;

import java.util.Arrays;

public class Practice05_2 {/*
        문항5.

        Earth-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
        알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
        spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
        존재하지 않는다면 2를 return하도록 완성하세요.

        제한사항
        - spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
        - 2 ≤ spell의 크기 ≤ 10
        - spell의 원소의 길이는 1입니다
        - 1 ≤ dic의 크기 ≤ 10
        - 1 ≤ dic의 원소의 길이 ≤ 10
        - spell의 원소를 모두 사용해 단어를 만들어야 합니다.
        - spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
        - dic과 spell 모두 중복된 원소를 갖지 않습니다.

        입출력 예
        spell                    dic                                           result
        ["p", "o", "s"]          ["sod", "eocd", "qixm", "adio", "soo"]        2
        ["z", "d", "x"]          ["def", "dww", "dzx", "loveaw"]               1
        ["s", "o", "m", "d"]     ["moos", "dzx", "smm", "sunmmo", "som"]       2
*/

    public static void main(String[] args) {
        int result1 = input(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
        System.out.println(result1);

        int result2 = input(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
        System.out.println(result2);

        int result3 = input(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
        System.out.println(result3);

    }

    public static int input(String[] spell, String[] dic) {
        boolean result = false;
        int count = 0;
        for (String d: dic) {


        }


        return 2;
    }
}


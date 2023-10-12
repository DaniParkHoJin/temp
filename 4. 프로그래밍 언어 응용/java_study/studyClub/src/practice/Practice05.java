package practice;
/*
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

public class Practice05 {
    public static void main(String[] args) {

            int result1 = input(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
            System.out.println(result1);

            int result2 = input(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
            System.out.println(result2);

            int result3 = input(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
            System.out.println(result3);


    }
    public static int input(String[] spell, String[] dic) {
        boolean check = false;
        for (String d : dic) {
            int count = 0;  // dic의 요소와 spell의 요소가 같을 때 갯수를 담기 위한 변수
            for (String s : spell) { // 향상된 for문으로 spell의 요소 만큼 반복
                if (d.contains(s)) count++; // dic과 spell의 요소를 비교하는 conatins로 참이면 count가 하나씩 올라감
            }
            if (count == spell.length) { // count의 수가 spell의 길이와 같으면 check 값을 true(참)으로 변경하고 멈춤.
                check = true;   // count의 수가 spell와 같다는 의미는 spell의 요소가 모두 dic에 쓰였다는 의미다.
                break;
            }
        }               // count의 수와 spell의 수가 같지 않으면 ckeck는 그래도 false이므로 2가 반환된다.
        return check ? 1 : 2;
    }
}

package exam01;

public class Ex02 {
    public static void main(String[] args) {
        String str1 = "가나다";
        String str2 = "가나다"; // 이러면 주소가 동일하다. 리터럴 상수와 마찬가지로 문자열 상수
        System.out.println(str1 == str2); // trun
        System.out.printf("str1.equals(str2) : %s%n", str1.equals(str2)); // true
        System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str2 주소 : " + System.identityHashCode(str2));

    }
}

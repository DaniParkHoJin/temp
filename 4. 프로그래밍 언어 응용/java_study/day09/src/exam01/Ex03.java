package exam01;

public class Ex03 {
    public static void main(String[] args) {
        String str1 = new String("가나다");
        String str2 = new String("가나다");
        System.out.println(str1 == str2);
        System.out.printf("str1 주소 : %d, str2의 주소 : %d%n", System.identityHashCode(str1),System.identityHashCode(str2));
    }
}

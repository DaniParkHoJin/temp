package exam01;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(System.identityHashCode(str));

        System.out.println(str);
        // System.out.println(str == "ABCDEFGHI"); 문자열 비교는 다양한 객체를 통해 만들어지기에 "=="로 비교해서는 안된다.
        System.out.println(str.equals("ABCDEFGHI"));


    }
}

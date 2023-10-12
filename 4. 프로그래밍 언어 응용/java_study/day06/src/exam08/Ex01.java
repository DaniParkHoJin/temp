package exam08;

public class Ex01 {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner(); // 2. 일반 클래스처럼 생성
        in.method();
    }
}

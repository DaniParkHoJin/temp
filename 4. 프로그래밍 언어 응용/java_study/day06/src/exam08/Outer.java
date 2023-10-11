package exam08;

public class Outer {
    int num1 =10;
    static int num2 = 20;
    static class Inner { // 1. 내부에 선언하면서 static을 붙인다.
        void method() {
            System.out.println("정적 내부 클래스!");

            //System.out.println(Outer.this.num1); // 오류 발생

            System.out.println(num2);

            Outer out = new Outer(); // 외부 클래스 객체 생성
            System.out.println(out.num1);
        }

    }
}

package exam01;
public class Outer {
    public Calculator cal = new Calculator() {
        public int add(int num1, int num2) {
            return num1 + num2;
            // 미 구현된 메서드를 구현하면서 객체가 된다.
        }
    };

    Calculator method(int num3) { // num3이 호출 후 제거되어야 하는데?? 아래에서 사용함으로 상수화 된다.
        return new Calculator() { // 지역변수의 상수화 final int num3
            public int add(int num1, int num2) {
                return num1 + num2 + num3; // num3이 사용될 수 없어야 하는데??

            }
        };


        /*  class Inner { // 1. Outer 안에 Inner 클래스를 만듦
            void method() {
                System.out.println("지역 내부 클래스!");
            }
        }
        Inner in = new Inner();
        in.method();*/
    }
}

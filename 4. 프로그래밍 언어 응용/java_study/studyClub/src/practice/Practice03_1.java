package practice;

public class Practice03_1 {
    /*        문항3.
            - 건물에서 30m 떨어진 지점에서 건물의 꼭대기를 올려본 각을 측정해보니 45°였다고 한다.
            - 관측자의 눈 높이는 지상으로부터 1.6m 떨어져 있다고 한다.
            - 건물의 높이를 구하시오.

            참고)
            수학 관련 함수는 java.lang.Math 클래스를 활용할 것
    */
    public static void main(String[] args) {
        double total = 0;

        double me_long = 30;
        double me_angle = 45;
        double me_tall = 1.6;

        me_angle = Math.toRadians(me_angle);
        total = me_long * Math.round(Math.tan(me_angle)) + me_tall;

        System.out.println(total);
    }
}

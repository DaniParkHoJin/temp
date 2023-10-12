package practice;

public class Practice03 {
    /*        문항3.
            - 건물에서 30m 떨어진 지점에서 건물의 꼭대기를 올려본 각을 측정해보니 45°였다고 한다.
            - 관측자의 눈 높이는 지상으로부터 1.6m 떨어져 있다고 한다.
            - 건물의 높이를 구하시오.

            참고)
            수학 관련 함수는 java.lang.Math 클래스를 활용할 것
    */
    public static void main(String[] args) {

        double humanTall = 1.6;
        double buildingToMe = 30;
        double angle = 45;

        System.out.println((int)Math.round(Math.tan(Math.toRadians(angle))));


    }
}

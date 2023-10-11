package exam01;
import static java.lang.Math.*;
public class Ex02 {
    public static void main(String[] args) {
        double total;
        double my_long = 20;
        double my_tall = 1.5;
        double my_angle = 60;

        my_angle = tan(toRadians(my_angle));// tan는 라디안 값이 들어가야 한다. Radian으로 바꾸고 tan으로
        total = my_angle * my_long + my_tall;// 반올림하면 그 차이가 너무 크다 그래서 반올림 하지 않고,
                                            // 비율이기 때문에 거리에 곱해주고 내 눈높이를 더한다.
        System.out.println(total);
    }
}

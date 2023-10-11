package practice;

public class Practice04 {
    /*  문항4.
        - A 자동차와 B자동차는 서로 같은 도착 지점을 향해 가고 있습니다.
                - A 자동차는 최초 60km/h속도로 이동하다가 한시간마다 10km/h씩 속력을 높이고 있고
        - B 자동차는 최초 40km의 속도로 이동하다가 한시간마다 15km/h씩 속력을 높이고 있습니다.
                - A 자동차와 B 자동차가 최초로 만나는 지점(km)를 구하시오.
    */
    public static void main(String[] args) {

        int carA = 60; // A 자동차 최초 속도
        int carB = 40; // B 자동차 최초 속도

        int carA_long = 60; // A 자동차 처음 한 시간 누적 거리
        int carB_long = 40; // B 자동차 처음 한 시간 누적 거리

        for (int i = 2; ; i++) { // 2시간부터 거리가 누적되기 때문에

            carA += 10; // A 자동차 i+1시간 당 증가 속도
            carB += 15; // B 자동차 i+1시간 당 증가 속도

            carA_long += carA; // A 자동차 i+1시간 당 누적 거리
            carB_long += carB; // B 자동차 i+1시간 당 누적 거리

            System.out.printf("%d시간 - A 자동차 누적 거리 : %d, B 자동차 누적 거리 : %d%n", i, carA_long, carB_long);
            if (carA_long == carB_long) { // A 자동차와 B 자동차의 누적거리가 같아지면 for문을 빠져나간다.
                System.out.printf("A 자동차와 B 자동차는 %d시간 후 %dkm에서 최초로 만납니다.%n", i, carA_long);
                break;
            }
        }
    }

}

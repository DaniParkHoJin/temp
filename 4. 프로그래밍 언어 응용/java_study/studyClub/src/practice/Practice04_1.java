package practice;

public class Practice04_1 {
    /*  문항4.
        - A 자동차와 B자동차는 서로 같은 도착 지점을 향해 가고 있습니다.
                - A 자동차는 최초 60km/h속도로 이동하다가 한시간마다 10km/h씩 속력을 높이고 있고
        - B 자동차는 최초 40km의 속도로 이동하다가 한시간마다 15km/h씩 속력을 높이고 있습니다.
                - A 자동차와 B 자동차가 최초로 만나는 지점(km)를 구하시오.
    */
    public static void main(String[] args) {
            int carA = 60;
            int carB = 40;

            int carA_distance = 60;
            int carB_distance = 40;

            boolean sameDistance = false;
            while (!sameDistance){
                int carA_increase = 10;
                int carB_increase = 15;

                carA += carA_increase;
                carB += carB_increase;

                carA_distance += carA;
                carB_distance += carB;

                if (carA_distance == carB_distance) {
                    sameDistance = true;
                    break;
                }

            }
        System.out.println(carA_distance);

    }
}

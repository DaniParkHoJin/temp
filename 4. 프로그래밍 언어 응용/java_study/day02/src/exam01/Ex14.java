package exam01;

public class Ex14 {
    public static void main(String[] args) {
        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while(num <= 100);
        System.out.println(total);

        // 초기값 (int num = 1), 조건식 (num <= 100), 증감식 (num++) -> 횟수 통제 가능
    }
}

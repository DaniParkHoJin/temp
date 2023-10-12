package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice02_1 {
    //- 정수로 된 난수 n개 발생 시킵니다.
    //- 발생한 정수를 작은 순서대로 나열 한 후 중간 값을 구하시오.
    //- n개가 홀수라면 중간 값은 1개, 짝수라면 중간 값은 2개가 됩니다.
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] rdArray = new int[n];
        Random rd = new Random();
        for (int i = 0; i < rdArray.length; i++) {
            rdArray[i] = rd.nextInt(101);
            System.out.print(rdArray[i] + ", ");
        }
        System.out.println();
        System.out.println("-----------------");
        Arrays.sort(rdArray);
        System.out.println(Arrays.toString(rdArray));

        if (rdArray.length % 2 == 0) {
            System.out.println(rdArray[rdArray.length/2] + ", "+ rdArray[rdArray.length/2-1]);
        } else {
            System.out.println(rdArray[rdArray.length/2]);
        }

    }
}

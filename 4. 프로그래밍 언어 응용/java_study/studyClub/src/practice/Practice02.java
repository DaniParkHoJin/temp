package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice02 {
//- 정수로 된 난수 n개 발생 시킵니다.
//- 발생한 정수를 작은 순서대로 나열 한 후 중간 값을 구하시오.
//- n개가 홀수라면 중간 값은 1개, 짝수라면 중간 값은 2개가 됩니다.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 정수를 입력 받을 수 있게 해주는 Scanner 객체 생성
        System.out.print("정수를 입력하세요 : ");
        int inputNum = sc.nextInt(); // 입력 받은 정수를 넣을 변수

        Random rd = new Random(); // 난수를 생성 해 주는 Random 객체 생성
        int[] rdArray = new int[inputNum]; // 입력 받은 정수를 담은 배열을 입력 받은 정수 만큼 생성
        for (int i = 0; i < rdArray.length; i++) { // 반복문을 통해 입력 받은 정수 만큼 반복하며 난수를 배열에 넣음
            rdArray[i] = rd.nextInt(50) + 1; // 1~50 사이의 난수를 생성한다.
            System.out.print(rdArray[i] + " "); // 확인을 위한 출력문
        }
        System.out.println(); // 개행
        System.out.println("-------------------"); // 개행

        Arrays.sort(rdArray); // 오름차순 정렬 메서드

        for (int i = 0; i < rdArray.length; i++) {
            System.out.print(rdArray[i] + " "); // 확인을 위한 출력문
        }
        System.out.println(); // 개행
        System.out.println("-------------------"); // 개행

        if (rdArray.length % 2 == 0) { // 짝수면 두 개를 출력하는 명령문
            System.out.println(rdArray[(rdArray.length / 2) - 1] + ", " + rdArray[rdArray.length / 2]);

        } else { // 홀수면 한 개를 출력하는 명령문
            System.out.println(rdArray[rdArray.length / 2]);
        }
    }
}
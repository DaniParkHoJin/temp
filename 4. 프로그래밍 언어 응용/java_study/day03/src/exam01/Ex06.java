package exam01;

import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        System.out.println(nums.length);
        /*
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        */
        /*
        for(int num : nums){ // 향상된 for문
            System.out.println(nums);
        }*/
        IntStream.range(0, nums.length).forEach(i -> System.out.println(nums[i]));

    }
}

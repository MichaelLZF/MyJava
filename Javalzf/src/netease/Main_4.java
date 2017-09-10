package netease;

import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            for (int i = n - 1; i >= 0; i -= 2) {
                System.out.print(nums[i] + " ");
            }
            for (int i = n % 2; i < n - 2; i += 2) {
                System.out.print(nums[i] + " ");
            }
            System.out.print(nums[n - 2]);
        }
    }
}
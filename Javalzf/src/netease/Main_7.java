package netease;

import java.util.Arrays;
import java.util.Scanner;
 
public class Main_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            Arrays.sort(nums);
            int min = nums[0];      // ��һ�μ�������е��Ǹ���Сֵ
            int max = nums[n - 1];  // ��һ�μ�������е��Ǹ����ֵ
            int diff = max - min;
            int minIndex = 1;       // δ��������е���Сֵ����
            int maxIndex = n - 2;   // δ��������е����ֵ����
            while (minIndex < maxIndex) {
                diff += max - nums[minIndex];
                diff += nums[maxIndex] - min;
                min = nums[minIndex++];
                max = nums[maxIndex--];
            }
            // ԭ���������һ���� minIndex == maxIndex�������ŵ����ʵ�λ����
            diff += Math.max(nums[maxIndex] - min, max - nums[minIndex]);
            System.out.println(diff);
        }
    }
}


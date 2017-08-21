package netease;

import java.util.Scanner;

public class Huiwen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int times = 0;
			int n = sc.nextInt();
			int[] inputArr = new int[n];
			for (int i = 0; i < n; i++) {
				inputArr[i] = sc.nextInt();
			}
//			int head = 0;
//			int tail = n - 1;
//			while (head < tail) {
//				if (inputArr[head] > inputArr[tail - 1]) {
//					inputArr[--tail] += inputArr[tail + 1];
//					times++;
//				} else if (inputArr[head] < inputArr[tail]) {
//					inputArr[++head] += inputArr[head - 1];
//					times++;
//				} else {
//					head++;
//					tail--;
//				}
//			}
			System.out.println(comb(inputArr,0,n-1));
		}
		sc.close();
	}

	private static int comb(int[] nums, int head, int tail) {
		int times = 0;
		int left = nums[head];
		int right = nums[tail];
		while (head < tail && left != right) {
			if (left < right) {
				left += nums[++head];
				times++;
			} else {
				right += nums[--tail];
				times++;
			}
		}
		if(head>=tail) return times;
		else return times+= comb(nums,++head,--tail);
	}
}

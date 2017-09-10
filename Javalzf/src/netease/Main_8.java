package netease;

/**
 * 1�����еĳ���Ϊn
2�������е�ÿ��������1��k֮��(����1��k)
3������λ�����ڵ�������A��B(A��Bǰ),������(A <= B)��(A mod B != 0)(������һ����)
����,��n = 4, k = 7
��ô{1,7,7,2},���ĳ�����4,��������Ҳ��1��7��Χ��,�����������������,����С����ϲ��������е�
����С�ײ�ϲ��{4,4,4,2}������С�С�׸���n��k,ϣ�����ܰ�������ж��ٸ�������ϲ�������С� 
��������:
���������������n��k(1 �� n �� 10, 1 �� k �� 10^5)


�������:
���һ������,������Ҫ������и���,��Ϊ�𰸿��ܴܺ�,�����1,000,000,007ȡģ�Ľ����
 */
import java.util.Scanner;

public class Main_8 {
    static final int mod = 1000000007;
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] state = new int[n+1][k+1];
         
        state[0][1] = 1;
         
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=1; j<=k; j++) {
                sum = (sum + state[i-1][j]) % mod;
            }
            for(int j=1; j<=k; j++) {
                int invalid = 0;
                int p = 2;
                while(p*j <= k) {
                    invalid = (invalid + state[i-1][p*j]) % mod;
                    p++;
                }
                state[i][j] = (sum - invalid + mod) % mod;
            }
        }
         
        int sum = 0;
        for(int i=1; i<=k; i++) {
            sum = (sum + state[n][i]) % mod;
        }
        System.out.println(sum);
         
        scanner.close();
    }
}
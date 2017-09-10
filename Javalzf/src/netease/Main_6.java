package netease;
/**
 * С�׽�n�����Ӱڷ���һ�����޴�������ϡ���i�����ӷ��ڵ�x[i]��y[i]�С�ͬһ������������ö�����ӡ�ÿһ�β���С�׿��԰�һ���������𲢽����ƶ���ԭ���ӵ��ϡ��¡����ҵ�����һ�������С�С����֪��Ҫ�������ϳ�����һ��������������i(1 �� i �� n)����������Ҫ�����ٲ�������.

��������:
�����������,��һ��һ������n(1 �� n �� 50),��ʾ���ӵĸ���
�ڶ���Ϊn�����ӵĺ�����x[i](1 �� x[i] �� 10^9)
������Ϊn�����ӵ�������y[i](1 �� y[i] �� 10^9)


�������:
���n������,��i����ʾ��������һ������������i����������Ҫ�Ĳ�����,�Կո�ָ��ĩ�޿ո�

��������ʾ:
����1������: ����Ҫ����
����2������: ��ǰ�������ӷ���(1, 1)��
����3������: ��ǰ�������ӷ���(2, 1)��
����4������: ���������Ӷ�����(3, 1)��

��������1:
4
1 2 4 9
1 1 1 1

�������1:
0 1 3 10
 */
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class Main_6 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int size = in.nextInt();
            int[] x = new int[size];
            int[] y = new int[size];
            for (int i = 0; i < size; i++) {
                x[i] = in.nextInt();
            }
            for (int i = 0; i < size; i++) {
                y[i] = in.nextInt();
            }
            int[] res = minOPs(size, x, y);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < size; i++) {
                result.append(String.valueOf(res[i]) + " ");
            }
            System.out.println(result.toString().trim());
        }
        in.close();
    }
 
    public static int[] minOPs(int size, int[] x, int[] y) {
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // ������Ȼ˳����������С�����ڶ���ͷ
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    // ��ÿ����x[i]y[j]�ֱ��������ӵ�ľ�����뵽���ȶ���
                    pq.add(Math.abs(x[k] - x[i]) + Math.abs(y[k] - y[j]));
                }
                int resI = 0;
                int sum = 0;
                while (!pq.isEmpty()) {
                    // sum�ۼ�m�Σ�����ø�����Ϊ��۵�ʱ��m�����ӵĵ��ܲ�������
                    sum += pq.poll();
                    // ������������Ϊ��۵㣬���ڸ�С�Ĳ�������������С���������
                    res[resI] = Math.min(res[resI], sum);
                    resI++;
                }
            }
        }
        return res;
    }
 
}
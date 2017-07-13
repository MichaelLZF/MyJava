package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 月饼是中国人在中秋佳节时吃的一种传统食品，不同地区有许多不同风味的月饼。
 * 现给定所有种类月饼的库存量、总售价、以及市场的最大需求量，请你计算可以获得的最大收益是多少。

注意：销售时允许取出一部分库存。样例给出的情形是这样的：
假如我们有3种月饼，其库存量分别为18、15、10万吨，总售价分别为75、72、45亿元。
如果市场的最大需求量只有20万吨，那么我们最大收益策略应该是卖出全部15万吨第2种月饼、以及5万吨第3种月饼，
获得 72 + 45/2 = 94.5（亿元）。

输入格式：

每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N表示月饼的种类数、
以及不超过500（以万吨为单位）的正整数D表示市场最大需求量。
随后一行给出N个正数表示每种月饼的库存量（以万吨为单位）；最后一行给出N个正数表示每种月饼的总售价（以亿元为单位）。
数字间以空格分隔。

输出格式：

对每组测试用例，在一行中输出最大收益，以亿元为单位并精确到小数点后2位。

输入样例：
3 20
18 15 10
75 72 45
输出样例：
94.50
 * @author zhuofeili
 *贪心算法
 */
public class Main1020 {

	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//数量
		double D = sc.nextInt();//容量
		ArrayList<MyObject> lists = new ArrayList<MyObject>(N);
		sc.nextLine();
		String[] strN = new String[N];
		String[] strP = new String[N];
		float[] strS = new float[N];
		
		for(int i = 0;i<N;i++){
			strN = sc.nextLine().split("\\s+");
			strP = sc.nextLine().split("\\s+");
			
			MyObject myobject = new MyObject(Integer.valueOf(strN[i])
					,Integer.valueOf(strP[i]));
			myobject.priceRatio = (myobject.price*1.0)/(myobject.num);
			lists.add(myobject);
		}
		Collections.sort(lists,new Comparator<MyObject>(){

			@Override
			public int compare(MyObject o1, MyObject o2) {
				if(o1.priceRatio>o2.priceRatio){
					return -1;
				}else{
					return 1;
				}
			}
			
		});
		MyObject tmp = null;
		for(int i = 0;i<N && D>0;i++){
			tmp = lists.get(i);
			if(D>=tmp.num){
				D = D -tmp.num;
				tmp.x = 1.0;
			}else{
				tmp.x = (D*1.0)/tmp.num;
				D = D-(tmp.num*tmp.x);
			}
		}
		double sum =0; 
		for(MyObject myo :lists){
			sum += myo.price * myo.x;
//			System.out.println( "物品价格是:" + myo.price + "的物品, 装入比例是:" + myo.x );
			
		}
		System.out.println(sum);
 	}
}
class MyObject{
	public int num = 0;
	public int price = 0;
	public double priceRatio = 0;
	public double x =0;
	public MyObject(int num,int price){
		this.num = num;
		this.price = price;
	}
}

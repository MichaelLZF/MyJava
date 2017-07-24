package advanced;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class Main1003 {
	static Main1003 instance = new Main1003();
	static int[] dis;
	static int[] rescue;
	static int[] vis;
	static Vector<Edge>[] map;
	static final int INF = Integer.MAX_VALUE - 10000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int st = sc.nextInt();
		int des = sc.nextInt();
		map = new Vector[N];
		rescue = new int[N];
		dis = new int[N];
		vis = new int[N];
		for (int i = 0; i < N; i++) {
			rescue[i] = sc.nextInt();
			dis[i] = INF;
			map[i] = new Vector<Edge>();
			vis[i] = 0;
		}
		for (int i = 0; i < M; i++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int distance = sc.nextInt();
			Edge e1 = instance.new Edge(c2, distance);
			map[c1].add(e1);
			Edge e2 = instance.new Edge(c1,distance);
			map[c2].add(e2);
		}
		ShortestPathFasterAlogrithm(st);
		dfs(st,des,rescue[st],dis[st]);
		System.out.println(shortestPathCount+" "+rescueTotal);
	}

	public static void ShortestPathFasterAlogrithm(int st) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(st);
		dis[st] = 0;
		vis[st] = 1;
		while (!q.isEmpty()) {
			int cur = q.poll();
			vis[cur] = 0;
			Vector<Edge> adjEdges = map[cur];
			for (int i = 0; i < adjEdges.size(); i++) {
				int to = adjEdges.get(i).to;
				int len = adjEdges.get(i).len;

				if (dis[cur] + len < dis[to]) {
					dis[to] = dis[cur] + len;
					if (vis[to] == 0) {
						q.add(to);
						vis[to] = 1;
					}
				}
			}
		}
	}

	static int shortestPathCount = 0;
	static int rescueTotal = 0;

	public static void dfs(int st, int des, int rescueTeamSum, int distance) {
		if (st == des) {
			if (distance == dis[des]) {
				shortestPathCount++;
			}
			if (distance == dis[des] && rescueTeamSum > rescueTotal) {
				rescueTotal = rescueTeamSum;
			}
			return;
		}
		if (dis[st] > dis[des]) {
			return;
		}
		Vector<Edge> adjCities = map[st];
		for (int i = 0; i < adjCities.size(); i++) {
			int to = adjCities.get(i).to;
			int len = adjCities.get(i).len;
			if (dis[st] + len <= dis[to]) {
				dfs(to, des, rescueTeamSum + rescue[to], dis[to]);
			}
		}
	}

	class Edge {
		int to;
		int len;

		public Edge(int to, int len) {
			this.to = to;
			this.len = len;
		}
	}
}

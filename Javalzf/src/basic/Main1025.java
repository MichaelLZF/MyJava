package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main1025 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String begin = input.next();
		int nodeNum = input.nextInt();
		int no = input.nextInt();
		Map<String, Node> map = new HashMap<String, Node>();

		while (nodeNum-- > 0) {
			String address = input.next();
			int val = input.nextInt();
			String nextAddress = input.next();
			Node node = new Node(address, val, nextAddress);
			map.put(address, node);
		}
		List<Node> list = new ArrayList<Node>();
		String next = begin;
		while (true) {
			Node getNode = map.get(next);
			list.add(getNode);
			if (getNode.nextAddress.equals("-1")) {				
				break;
			} else {
				next = getNode.nextAddress;
			}
		}
		for (int i = no; i < list.size(); i += no) {
			int s = i-no;
			int e = i - 1;
			while (s < e) {
				Node tempNode = list.get(s);
				list.set(s, list.get(e));
				list.set(e, tempNode);
				s++;
				e--;
			}
		}
		for (int i = 0; i < list.size() - 1; i++) {
			Node printNode = list.get(i);
			Node printNextNode = list.get(i + 1);
			System.out.println(printNode.address + " " + printNode.val + " " + printNextNode.address);
		}
		Node endNode = list.get(list.size() - 1);
		System.out.println(endNode.address + " " + endNode.val + " " + "-1");
	}
}


class Node {
	String address;
	String nextAddress;
	int val;


	public Node(String address, int val, String nextAddress) {
		this.address = address;
		this.val = val;
		this.nextAddress = nextAddress;
	}
}

package javabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("aa");
		l.add("bb");
		l.add("cc");
		for (Iterator iter = l.iterator(); iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println(str);
		}
		/*
		 * 迭代器用于while循环 Iterator iter = l.iterator(); while(iter.hasNext()){
		 * String str = (String) iter.next(); System.out.println(str); }
		 */
	}

}

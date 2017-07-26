package data.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Listtest {

	public static void main(String[] args) {
		List<Integer> alists = new ArrayList<Integer>();
		List<Integer> vlists = new Vector<Integer>();
		
		int N = 100;
		for(int i = 0;i<N;i++){
			alists.add(i);
			vlists.add(i);
		}
	}

}

package data.structure;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args){
		HashMap<Dog,Integer> hasmap = new HashMap<Dog,Integer>();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		hasmap.put(d1, 10);
		hasmap.put(d2, 15);
		hasmap.put(d3, 5);
		hasmap.put(d4, 20);
		
		System.out.println(hasmap.size());
		
		for(Entry<Dog,Integer> entry:hasmap.entrySet()){
			System.out.println(entry.getKey().toString()+" - "+entry.getValue());
		}
	}
}
class Dog {
	String color;
	Dog(String c){
		color = c;
	}
	@Override
	public String toString() {
		return color+" dog";
	}
	@Override
	public boolean equals(Object obj) {
		return ((Dog) obj).color == this.color;
	}
	@Override
	public int hashCode() {
		return color.length();
	}
	
}

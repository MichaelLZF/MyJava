package com.lzf011;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		Box<Integer> age = new Box<Integer>(712);
		Box<Number> number = new Box<Number>(312);
		Box<String> name = new Box<String>("dasd");
//		getData(name);
		getData(age);
		getData(number);
		out("findingsea",123,1.22,true);
	}
	//Í¨Åä·û
	public static void getData(Box<? extends Number> data){
		System.out.println("data : "+data.getData());
	}
	public static <T> void out(T...args){
		for(T t:args){
			System.out.println(t);
		}
	}

}
class Box<T>{
	private T data;
	public Box(){
		
	}
	public Box(T data){
		this.data = data;
	}
	public T getData(){
		return data;
	}
	public void setData(T data){
		this.data = data;
	}
}


package javabase;

public class MyThreadTest1 extends Thread {
	private String name;

	public MyThreadTest1(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("hello " + name);
	}

	public static void main(String[] args) {
		Thread thread = new MyThreadTest1("world");
		thread.start();
	}
}
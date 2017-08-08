package javabase;

/**
 * 建立三个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC
 * 
 * @author zhuofeili 为了控制执行的顺序，必须要先持有prev锁，也就前一个线程要释放自身对象锁，
 *         再去申请自身对象锁，两者兼备时打印，之后首先调用self.notify()释放自身对象锁，
 *         唤醒下一个等待线程，再调用prev.wait()释放prev对象锁，终止当前线程，等待循环结束后再次被唤醒
 */
public class MyThreadPrinter implements Runnable {

	private String name;
	private Object prev;
	private Object self;

	private MyThreadPrinter(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name);
					count--;

					self.notify();
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) throws Exception {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		MyThreadPrinter pa = new MyThreadPrinter("A", c, a);
		MyThreadPrinter pb = new MyThreadPrinter("B", a, b);
		MyThreadPrinter pc = new MyThreadPrinter("C", b, c);

		new Thread(pa).start();
		Thread.sleep(100); // 确保按顺序A、B、C执行
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);
	}
}

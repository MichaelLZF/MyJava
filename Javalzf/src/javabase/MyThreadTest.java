package javabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@SuppressWarnings("unchecked") 
public class MyThreadTest {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		System.out.println("kaishi");
		Date date1 = new Date();
		
		int taskSize = 5;
		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		List<Future> list = new ArrayList<Future>();
		for(int i = 0;i<taskSize;i++){
			Callable c = new MyCallable(i+" ");
			Future r = pool.submit(c);
			list.add(r);
		}
		pool.shutdown();
		for(Future f:list){
			System.out.println(">>>"+f.get().toString());
		}
		Date date2= new Date();
		System.out.println("run time"+(date2.getTime()-date1.getTime())+"ms");
	}
}
class MyCallable implements Callable<Object>{
	private String taskNum;

	MyCallable(String taskNum){
		this.taskNum = taskNum;
	}
	@Override
	public Object call() throws Exception {
		System.out.println(">>>"+taskNum+"start");
		Date dateTmp1 = new Date();
		Thread.sleep(1000);
		Date dateTmp2 = new Date();
		long time = dateTmp2.getTime()-dateTmp1.getTime();
		System.out.println(">>>"+taskNum+"stop");
		return taskNum+"time"+time+"ms";
	}
}

package com.sample.basics;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) {
		ExecutorService executorService =null;
		
		try {
		Callable callable = new CallableExample();

		//Executor
		executorService =	Executors.newSingleThreadExecutor();
		Future future = executorService.submit(callable);
			System.out.println("from call method : "+future.get());
		} catch (InterruptedException | ExecutionException e) {
			
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}

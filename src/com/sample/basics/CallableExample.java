package com.sample.basics;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int count = 100;
		return count;
	}
	

}

package com.hanbuger.mybatistest;

import org.junit.Test;

public class TestClassLoader {

	@Test
	public void test() {
		ClassLoader loader1 = TestClassLoader.class.getClassLoader();
		ClassLoader loader2 = Thread.currentThread().getContextClassLoader();
		ClassLoader loader3 = ClassLoader.getSystemClassLoader();
		System.out.println(loader1);
		System.out.println(loader2);
		System.out.println(loader3);
	}

}

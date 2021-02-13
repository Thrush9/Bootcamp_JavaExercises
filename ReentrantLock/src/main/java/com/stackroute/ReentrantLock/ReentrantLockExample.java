package com.stackroute.ReentrantLock;

public class ReentrantLockExample {

	public static void main(String[] args) {

		FileProcess file1 = new FileProcess("ustresource.txt");
		file1.start();
		
		FileProcess file2 = new FileProcess("ustconcurrent.txt");
		file2.start();
	}

}

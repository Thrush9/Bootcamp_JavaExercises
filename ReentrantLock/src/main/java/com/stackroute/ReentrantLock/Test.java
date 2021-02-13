package com.stackroute.ReentrantLock;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class GenerateSeries extends Thread {
	public static ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();

	public void run() {
		try {
			writeNumber();
			Thread.sleep(1000);
			readNumber();
		} catch (Exception e) {
		}
	}

	public void writeNumber() {
		try {
			rwlock.writeLock().lock();
			Random rand = new Random();
			int series = rand.nextInt(20);
			System.out.println(Thread.currentThread().getName() + " writing " + series);
		} catch (Exception e) {
		} finally {
			System.out.println("write over");
		}
		rwlock.writeLock().unlock();
	}

	public void readNumber() {
		try {
			rwlock.readLock().lock();
			System.out.println(Thread.currentThread().getName() + " reading ");
		} catch (Exception e) {
		} finally {
			System.out.println("read over ");
		}
		rwlock.readLock().unlock();
	}
}

//public class ExampleReentrant {
//
//}

public class Test {

	public static void main(String[] args) {
		GenerateSeries gen1 = new GenerateSeries();
		gen1.start();
		GenerateSeries gen2 = new GenerateSeries();
		gen2.start();

		GenerateSeries gen3 = new GenerateSeries();
		gen3.start();
	}
}

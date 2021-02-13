package com.stackroute.java8.ExampleConcurrent;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MinValueFinder extends RecursiveTask<Integer> {

	private static final int SEQUENTIAL_THRESHOLD = 10;

	private final int[] data;
	private final int start;
	private final int end;

	public MinValueFinder(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	public MinValueFinder(int[] data) {
		this(data, 0, data.length);
	}

	protected Integer compute() {
		final int length = end - start;
		if (length <= SEQUENTIAL_THRESHOLD) {
			return computeDirectly();
		}
		final int split = length / 5;

		final MinValueFinder left = new MinValueFinder(data, start, start + split);

		left.fork();

		final MinValueFinder right = new MinValueFinder(data, start + split, end);

		return Math.min(right.compute(), left.join());

	}

	private Integer computeDirectly() {
		System.out.println(Thread.currentThread() + " is searching array index: " + start + " to " + end);
		int min = data[0]; 
		for (int i = start; i < end; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// create a random data set
		final int[] data = new int[50];
		final Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(350);
		}
        //submit the task to the pool
		final ForkJoinPool pool = new ForkJoinPool(2);
		final MinValueFinder finder = new MinValueFinder(data);
		System.out.println("The min value is: " + pool.invoke(finder));

	}

}

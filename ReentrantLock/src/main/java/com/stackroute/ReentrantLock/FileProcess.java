package com.stackroute.ReentrantLock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FileProcess extends Thread {

	public static ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();

	private String filename;

	public FileProcess(String name) {
		this.filename = name;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	private void readFromFile(String filename) {
		Path path = Paths.get(filename);
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader breader = Files.newBufferedReader(path, charset)) {
			rwlock.readLock().lock();
			String s;
			while ((s = breader.readLine()) != null)
				System.out.println(Thread.currentThread().getName() + " Reading Data :" + s);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(Thread.currentThread().getName() + " reading over");
		}
		rwlock.readLock().unlock();
	}

	private void writeInToFile(String filename) {
		Path path = Paths.get(filename);
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedWriter bwrite = Files.newBufferedWriter(path, charset, StandardOpenOption.APPEND)) {
			rwlock.writeLock().lock();
			bwrite.write("Thread Concurrent Process");
			bwrite.close();
			System.out.println(Thread.currentThread().getName() + " Writing Data into file");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(Thread.currentThread().getName() + " writing over");
		}
		rwlock.writeLock().unlock();
	}

	public void run() {
		try {
			writeInToFile(filename);
			//Thread.sleep(1000);
			readFromFile(filename);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

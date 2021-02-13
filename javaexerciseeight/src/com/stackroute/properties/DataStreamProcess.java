package com.stackroute.properties;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import com.stackroute.properties.repo.SourceData;

public class DataStreamProcess {

	public static void main(String[] args) throws IOException {

		SourceData source = new SourceData();
		Properties myprop = source.loadFile();
		Scanner scan = new Scanner(System.in);
		
		FileOutputStream fileout = new FileOutputStream(myprop.getProperty("filename"));
		FileInputStream filein = new FileInputStream(myprop.getProperty("filename"));
		
		int input = 0;
		while (input == 0) {
			System.out.println("1 - Add Data  2 - Display Data");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				DataOutputStream dataout = new DataOutputStream(fileout);
				System.out.println("Enter String");
				String str = scan.next();
				dataout.writeChars(str);
				break;
			case 2:
				DataInputStream datain = new DataInputStream(filein);
				while (datain.available() > 0) {
					System.out.print(datain.readChar());
				}
				break;
			default:
				break;
			}
			System.out.println("\nDo want to continue ?  0 - Yes 1 - No");
			input = scan.nextInt();
		}
		scan.close();
	}

}

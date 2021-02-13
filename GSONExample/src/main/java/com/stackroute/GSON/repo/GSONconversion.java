package com.stackroute.GSON.repo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stackroute.GSON.model.Bootcamp;

public class GSONconversion {

	public static void storeJsonData(Map bootcampData)
	{
		Gson gsonobj=new GsonBuilder().setPrettyPrinting().create();
		String jsondata=gsonobj.toJson(bootcampData);
		try
		{
			FileWriter filewrite=new FileWriter("bootcamp.dat");
			BufferedWriter bwriter=new BufferedWriter(filewrite);
			bwriter.write(jsondata);
			bwriter.close();
			System.out.println("File created");
		}
		catch(Exception e)
		{
			System.out.println("Exception : " + e);
		}
	}
	
	public static Bootcamp readData() throws IOException
	{
		FileReader reader=new FileReader("bootcamp.dat");
		BufferedReader bufferreader=new BufferedReader(reader);
		String data= new String(Files.readAllBytes(Paths.get("bootcamp.dat")));
		Gson gsonobj=new GsonBuilder().setPrettyPrinting().create();
		Bootcamp camp=gsonobj.fromJson(data, Bootcamp.class);
	//	System.out.println(bank);
		return camp;	
	}
	
}


package com.stackroute.GSON;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.stackroute.GSON.model.Bootcamp;
import com.stackroute.GSON.repo.GSONconversion;

/**
 * Hello world!
 *
 */
public class GSONexample 
{
    public static void main( String[] args ) throws IOException
    {
        Map<Object, Object> datamap = new HashMap<>();
        datamap.put("subject", "Java FSD");
        datamap.put("companyName", "UST-G"); 
        GSONconversion.storeJsonData(datamap);
        Bootcamp camp = GSONconversion.readData();
        System.out.println(camp);
    }
}

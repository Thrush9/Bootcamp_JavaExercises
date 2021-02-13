package com.stackroute.properties.repo;

import java.util.Properties;

public class SourceData {

	public Properties loadFile() {
		Properties props = new Properties();
		props.put("filename", "worldcup.dat");
		return props;
	}
}

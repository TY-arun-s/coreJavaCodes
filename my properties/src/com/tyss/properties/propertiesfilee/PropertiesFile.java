package com.tyss.properties.propertiesfilee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.*;

public class PropertiesFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream myobj = new FileOutputStream("file.properties");
		Properties pro = new Properties();
		pro.setProperty("name", "Arun");
		pro.setProperty("email", "arun@gmail.com");
		pro.store(myobj, "comment");
		System.out.println("properties file created");

	}
}

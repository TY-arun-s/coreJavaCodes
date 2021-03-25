package com.tyss.properties.readfileprop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FileReader {

	public static void main(String[] args) throws IOException {
		FileInputStream inStream = new FileInputStream("myprop.properties");
		Properties pro = new Properties();
		pro.load(inStream);
		String name = (String) pro.get("name");
		String company = (String) pro.get("company");
		System.out.println("name=" + name + "company" + company);
	}

}

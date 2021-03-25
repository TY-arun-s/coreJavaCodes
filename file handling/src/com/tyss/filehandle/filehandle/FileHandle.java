package com.tyss.filehandle.filehandle;
import java.io.*;

public class FileHandle {
public static void main(String[] args) throws IOException {
	File myobj=new File("D:\\FileHandling\\File1.txt");
	if(myobj.createNewFile()) {
		System.out.println("Created file"+myobj.getName());
	}else {
		System.out.println("File Exists");
	}
}
}

package com.lockedme;

import java.io.File;
import java.io.IOException;


public class FileSystem {
	
	public static boolean createFile(String fileName) throws IOException{
		File file = new File(fileName);
		return file.createNewFile();
		
	}
	
	public static String[] getFiles() {
		File folder = new File("/");
		return folder.list();		
	}
	
	public static void deleteFile(String file) {
		
	}
	
}

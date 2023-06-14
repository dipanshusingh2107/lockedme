package com.lockedme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;


public class FileSystem {
	
	private static String root = "/Users/sushantkumar/Desktop/lockedme/";
	
	public void setRoot(String path) {
		File rootPath = new File(path);
		
		if(rootPath.exists()) {
			FileSystem.root = path;
		}
	}
		
	
	public static boolean createFile(String fileName) throws IOException{
		File file = new File(root+fileName);
		return file.createNewFile();
		
	}
	
	public static String[] getFiles() {
		File folder = new File(root);
		String[] files = folder.list();
		
		
		Arrays.sort(files);
		return files;		
	}
	
	public static void deleteFile(String fileName) throws FileNotFoundException {
		File file = new File(root+fileName);
		
		if(file.exists() == false)
			throw new FileNotFoundException("File not found");
		
		file.delete();
	}
	
	public static boolean searchFile(String fileName) {
		File file = new File(root+fileName);
		return file.exists();
	}
	
	public static void main(String[] args) {
		try {
			
			FileSystem.createFile("somename.txt");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		for(String s:FileSystem.getFiles())
			System.out.println(s);
	
	}
	
}

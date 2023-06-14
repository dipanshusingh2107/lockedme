package com.lockedme;

public class Output {

	static public void displayMainMenu() {
		System.out.println("1. Show Files");
		System.out.println("2 . More Operation");
		System.out.println("3. Exit");
	}
	
	static public void displayMoreMenu() {
		System.out.println("1. Add File");
		System.out.println("2. Search File");
		System.out.println("3. Delete File");
		System.out.println("4. Go back");
	}
	
	static public void displayGetFiles(String[] files) {
		System.out.println("Files Present are:");
		for(String s:files) {
			System.out.println("--> "+s);
		}
	}
	

}

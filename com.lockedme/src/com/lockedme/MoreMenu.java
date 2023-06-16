package com.lockedme;
import java.io.IOException;
import java.util.Scanner;

public class MoreMenu {
	
	static Scanner sc = new Scanner(System.in);
	static int numberOfOptions = 4;
	
	public static void main(String[] args) {

		while(true) {
			int option = 0;
			Output.displayMoreMenu();
			
			try {				
				option = Integer.parseInt(sc.next());
				if(option > MoreMenu.numberOfOptions || option <1)
					throw new Exception("Invalid option");
			}catch (Exception e){
				System.out.println("Invalid option");
				continue;
			}
			
			if(option == 1) {
				
				System.out.println("Enter file name to be created");
				String fileName = sc.next();
				fileName = fileName.toLowerCase();
				
				try {
					boolean result = FileSystem.createFile(fileName);
					
					if(result == true)
						System.out.println("File Created");
					else
						System.out.println("File Already Exists");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				
			}else if(option == 2) {
				
				System.out.println("Enter file name to be searched");
				String fileName = sc.next();
				if(FileSystem.searchFile(fileName))
					System.out.println("File Present");
				else
					System.out.println("File Absent");
				
			} else if(option == 3) {
				
				System.out.println("Enter file name to be deleted");
				String fileName = sc.next();
				
				try {
					FileSystem.deleteFile(fileName);
					System.out.println("File Deleted");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				
			} else if(option == 4) {
				break;
			}
			
			
		}
		
	}
}

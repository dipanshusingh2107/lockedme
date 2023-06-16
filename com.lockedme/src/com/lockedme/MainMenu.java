package com.lockedme;

import java.util.Scanner;



public class MainMenu {

	static Scanner sc = new Scanner(System.in);
	static int numberOfOptions = 3;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			int option = 0;
			Output.displayMainMenu();
			
			try {				
				option = Integer.parseInt(sc.next());
				if(option > MainMenu.numberOfOptions || option <1)
					throw new Exception("Invalid option");

			}catch (Exception e){
				System.out.println("Invalid option");
				continue;
			}
			
			
			try {
				
				if(option == 1) {
					
					Output.displayGetFiles(FileSystem.getFiles()); 
					
				}else if(option == 2) {
					
					MoreMenu.main(null);
					
				} else if(option == 3) {
					
					System.out.println("Exiting..... Bye");
					break;
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
					
		}

	}

}

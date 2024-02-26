package lnt_mid;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		
		do {
			System.out.println("+==================+");
			System.out.println("|       MENU       |");
			System.out.println("+==================+");
			System.out.println("1. Input Vehicle");
			System.out.println("2. View vehicle");
			System.out.println("3. Exit");
			System.out.print(">>");
			menu = scan.nextInt();
			scan.nextLine();
			cls();
			
			if(menu == 1) {
				String vehicleType;
				int correction = 0;
				do {
					System.out.print("Input Type [Car | Motorcycle]: ");
					vehicleType = scan.next();
					if(vehicleType.equals("Car")) {
						System.out.println("Ini Mobil");
						correction = 1;
					} else if(vehicleType.equals("Motorcycle")) {
						System.out.println("Ini Motor");
						correction = 1;
					} else {
						correction = 1;
					}
				}while(correction != 1);
					
				
			}
		}while(menu!= 3);
		System.out.println("Tes");
	}
	
	public static void cls() {
		for(int i = 0; i < 32; i++) {
			System.out.println();
		}
	}
}

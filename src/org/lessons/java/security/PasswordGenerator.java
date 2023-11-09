package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("firstName: ");
		String firstName= sc.nextLine();
		
		System.out.print("\nlastName: ");
		String lastName = sc.nextLine();

		System.out.print("\nmyFavoriteColor: ");
		String myFavoriteColor = sc.nextLine();
		
		System.out.print("\nbirthDay: ");
		int birthDay = sc.nextInt();

		System.out.print("\nbirthMonth: ");
		int birthMonth = sc.nextInt();
		
		System.out.print("\nbirthYear: ");
		int birthYear = sc.nextInt();		
		
		sc.close();
		
		String password = firstName + "-" + lastName + "-" 
				+ myFavoriteColor + "-" + (birthDay + birthMonth + birthYear);

        System.out.println("Password: " + password);
				
		
		
	}

}

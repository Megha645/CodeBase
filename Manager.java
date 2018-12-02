package com.example.java;

import java.util.Scanner;

public class Manager {
	
	int totalNumberOfRooms=5;
	int availableRooms=0;
	
	
	
	public void checkIn()
	{
		
		//Guests check in
		System.out.println("Check In to your room");
	}
	
	public void checkOut()
	{
		//checkout from Room
		System.out.println("Check out from your room");
	}
	
	public void bookRoom()
	{
		
		//Make a reservation
		Person person=new Person();
		person.getData();
		
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose one option");
		System.out.println("1. Make Reservation");
		System.out.println("2. Check-In");
		System.out.println("3. Check-Out");
	
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		
		Manager manager=new Manager();
		
		
		switch(option)
		{
		case "1":
			manager.bookRoom();
			break;
			
		case "2":
			manager.checkIn();
			
		case "3":
			manager.checkOut();
		}
		
		

	}

}

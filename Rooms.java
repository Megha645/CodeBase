package com.example.java;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Rooms {

	boolean isAvailble= false;
	
	int capacity;
	String type=new String();
	int roomNumber;
	float rent;
	
	public Rooms(int roomNumber,int capacity,String type,float rent)
	{
		this.roomNumber=roomNumber;
		this.capacity=capacity;
		this.type=type;
		this.rent=rent;
	}
	
	public void addRoom(Rooms room)
	{
		ArrayList<Rooms> allRooms=new ArrayList<>();
		allRooms.add(room);
		
		for (Rooms rooms : allRooms)
		{
			System.out.println("  "+rooms.roomNumber+"              "+rooms.capacity+"     "+rooms.type+"    "+rooms.rent);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Room Number"+" "+"Capacity  "+" "+"Type  "+" "+"   Rent");
		Rooms room1=new Rooms(1, 1,"Single", 1200);
		room1.addRoom(room1);
		
		Rooms room2 =new Rooms(2, 2, "Double", 2000);
		room2.addRoom(room2);
		
		Rooms room3 =new Rooms(3, 2, "Delux", 4000);
		room3.addRoom(room3);
		
		Person person=new Person();
		String type=person.type;
		

	}

}

package com.example.java;

import java.util.Scanner;

public class Person {

	//String name = new String();
	int number=0;
	String type=new String();
	
	public void getData()
	{
		System.out.println("Enter number of guests");
		Scanner scanner =new Scanner(System.in);
		number= scanner.nextInt();
		
		System.out.println("Select Room type");
		System.out.println("1. Single\n2. Double\n3. Delux");
		type=scanner.next();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.getData();
	}

}

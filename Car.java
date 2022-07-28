package com.techouts.collections15;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
	int slot;boolean flag=true;
	static ArrayList<Integer> car=new ArrayList<>();
	Scanner sc=new Scanner(System.in);

    Car()
    {
	for(int i=1;i<=15;i++)
	{
		car.add(i);
	}
	}
    void display()
   	{
    	int n=2;
    	flag=true;
   		System.out.println("Available slots are:");
   		System.out.println(car);
   		System.out.println("Select anyone slot from above available slots ");
   		try
		{
		slot=Integer.parseInt(sc.next());
		}
		catch(Exception e)
		{
			System.out.println("Input must be a number");
			n--;
			if(n==1)
			{
			display();
			}
			flag=false;
		}
		if(flag)
		{
	   		Car.check(slot);
		}
   		
   		
   	}
   	static void check(int slot)	{
   		
   		if(slot<=15)
   		{	
   		if(car.contains(slot))
   		{
   			System.out.println("Allocated slot is: "+slot);
   			car.remove(slot-1);
   		}
   		else
   		{
   			System.out.println("Already Booked " +slot);
   		}
   		}
   		else
   		{
   			try
   			{
   			throw new InvalidSelectException("");
   			}
   			catch(Exception e)
   			{
   				System.out.println("\nplease select from the available slots");
   				
   			}
   		}
   		
   		
   	}
   }
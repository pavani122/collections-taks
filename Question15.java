/*parking slots
1. there are two basements b1 and b2 both contains 30 slots
2. b1 for bikes and b2 for cars
3. allocate a vehicles with slots and generate a receipt and don't allocate a single slot for two vehicles
4. and store the data in a file*/

package com.techouts.collections15;
import java.util.*;

public class Question15 {

	final static Scanner  sc =new Scanner(System.in);
	public static void main(String[] args) throws InputMismatchException {
		int slot,a=0;
		String s="y";
		Bike bikeObj=new Bike();
		Car carObj=new Car();
		boolean flag = true;
		do
		{
		System.out.println("Select one from below \n 1.Bike \t 2.Car");
		try
		{
		a=Integer.parseInt(sc.next());
		}
		catch(Exception e)
		{
			System.out.println("Input must be number");
			flag = false;
		}
		if(flag){
		if(a==1)
		{
			bikeObj.display();
		}
		else if(a==2)
		{
			carObj.display();
			
		}
		
		else 
		{
			System.out.println("Please select only the available type");
		
		}
		}
		System.out.println("Do you want to continue,enter y or n:");
		 s = sc.next();
		 flag=true;
		}
		while(s.equalsIgnoreCase("y"));
	}

}
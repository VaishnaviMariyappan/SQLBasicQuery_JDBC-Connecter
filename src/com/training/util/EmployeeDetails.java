package com.training.util;


import java.util.Scanner;
public class EmployeeDetails
{
public void employeeStatus(char gender, int age)
{
if(gender == 'M')
{
if((age>=20) && (age<40))
{
System.out.println("You may work in Anywhere");
}
else if((age>=40) && (age<60))
		{
	System.out.println("You will be work in Urban areas only");
	}
	else 
	{
	System.out.println("Error");
	}
	}
	else if (gender == 'F')
	{
	System.out.println("You will be work in Urban areas only");
	}
	else 
	{
	System.out.println("Error");
	}
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Age:");
int age = sc.nextInt();
System.out.println("Enter your gender:");
char gender = sc.next().charAt(0);
System.out.println("Enter your maritalstatus:");
char maritalstatus = sc.next().charAt(0);
EmployeeDetails ed = new EmployeeDetails();
ed.employeeStatus(gender,age);
System.out.println(ed);
}
}

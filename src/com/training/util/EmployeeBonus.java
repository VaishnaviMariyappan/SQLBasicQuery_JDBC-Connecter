package com.training.util;


import java.util.*;
public class EmployeeBonus 
{
public void bonusAmount(double salary,int service )
{
if (service > 5)
{
double bonus;
bonus = salary * 0.05;
System.out.println("Net BonusAmount is: " +bonus);
}
else
{
System.out.println("No Bonus");
}
}
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your years of service: ");
int yearsOfService = scanner.nextInt();
System.out.print("Enter your salary: ");
double salary = scanner.nextDouble();
EmployeeBonus eb= new EmployeeBonus();
eb.bonusAmount(salary,yearsOfService);
}
}


package com.training.util;


import java.util.Scanner;
public class Shop 
{
public void discount(int n)
{
if (n>1000)
{
System.out.println("Total cost = " + n);
System.out.println("The total cost with discount = "+(n-(n/100*10)));
}
else
{
System.out.println("The total cost = "+n);
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the quantity:");
int n = sc.nextInt();
int total = n*100;
Shop  s = new Shop();
s.discount(total);
System.out.println(s);
} 
}


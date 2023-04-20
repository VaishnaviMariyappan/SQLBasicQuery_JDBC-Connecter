package com.training.util;

import java.util.Scanner;
public class PressQ 
{
public void avgAndProductOfAllNumbers()
{
int number,sum=0,p=1;
char ch;
for(int i=1;i>=1;i++)
{
	System.out.println("Enter number:");
	Scanner sc = new Scanner(System.in);
	number=sc.nextInt();
	p=p*number;
	sum=sum+number;
	System.out.println("Press Q else n");
	ch = sc.next().charAt(0);
	if(ch=='n')
		continue;
	else if (ch=='q')
		System.out.println("you are Choosen to quit");
	break;
}
System.out.println("Product is: " +p);
System.out.println("The Sum is:" +sum);
}
public static void main(String[] args)
{
PressQ pq = new PressQ();
pq.avgAndProductOfAllNumbers();
}
}




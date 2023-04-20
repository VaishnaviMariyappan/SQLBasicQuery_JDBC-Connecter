package com.training.util;


import java.util.Scanner;
public class StudentAttendance 
{
public void studentAllowExamHall()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of class");
int n=sc.nextInt();
System.out.println("Enter the number of class attend");
int a=sc.nextInt();
float f=(a*100)/n;
System.out.println("percentage : " +f);
if(f<75)
{
System.out.println("Are you medical cause?");
System.out.println("Enter your choice");
System.out.println("1: yes");
System.out.println("2: No");
int choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("you can sit an exam");
break;
case 2:
System.out.println("you can't sit an exam");
break;
default:
System.out.println("If any other is pressed");
}
}
else
System.out.println("You can sit in examination room");
}
public static void main(String[] args)
{
StudentAttendance se = new StudentAttendance();
se.studentAllowExamHall();
}
}




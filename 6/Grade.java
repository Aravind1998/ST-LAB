import java.io.*;
import java.util.*;
class Grade
{
	public static void main(String[] args)
	{
	float per;
	char grade = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks to get grade");
	per = sc.nextFloat();
	if(per >= 90)
	{
		grade = 'A';
	}
	else if(per >=80 && per < 90)
	{
		grade = 'B';
	}
	else if(per >= 70 && per < 80)
	{
		grade = 'C';
	}
	else if(per >= 60 && per < 70)
	{
		grade = 'D';
	}
	else
	{
		grade = 'E';
	}
	switch(grade)
	{
		case 'A' : System.out.println("Excellent");
			   			break;

		case 'B' : System.out.println("Very Good");
			   			 break;

		case 'C' :  System.out.println("Good");
			   			  break;

		case 'D' :  System.out.println("Above Average");
			   			  break;

		case 'E' :  System.out.println("Satisfactory");
			   			  break;

		default : System.out.println("Invalid Grade");
	}
	System.out.println("The Percentage obtained is =  " + per + " and the grade obtained is " + grade);
	}
}

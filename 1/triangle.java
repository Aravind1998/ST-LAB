import java.util.*;
import java.io.*;

class triangle{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("Enter the values for the three sides of the triangle (between 0 and 200)");
		
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

		if(a >=0 && a <=200 && b>=0 && b<=200 && c >=0 && c <= 200)
		{
			if((a<b+c) && (b<a+c) && (c<a+b))
			{
				if((a==b) && (b==c))
				{
					System.out.println("Equilateral");
				}
			

				else if((a*a+b*b == c*c) || (b*b+c*c == a*a) || (a*a+c*c == b*b))
				{
					System.out.println("Right angled triangle");
				}

				else if((a!=b) && (a!=c) && (b!=c))
				{
					System.out.println("Scalene");
				}

				else if(((a==b) && (b!=c)) || ((a==c) && (a!=b)) || ((b==c) && (b!=a)))
				{
					System.out.println("Isosceles");
				}

				
			}
			else
			{
				System.out.println("Not a triangle");
			}
		}
		
		
		else
		{
			System.out.println("Invalid Input");
		}

	}
}

		

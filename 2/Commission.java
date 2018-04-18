import java.util.*;
import java.io.*;

class Commission{
public static void main(String[] args)
{
	int locks=0,stocks=0,barrels=0,total=0;
	double commission=0;
	int one_lock = 45;
	int one_stock = 30;
	int one_barrel = 25;
	int l=0,s=0,b=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of locks sold");
	locks = sc.nextInt();
	while(locks != -1)
	{
		System.out.println("Enter the number of stocks sold");
		stocks = sc.nextInt();
		System.out.println("Enter the number of barrels sold");
		barrels = sc.nextInt();
		l = l + locks;
		s = s + stocks;
		b = b + barrels;
		System.out.println("Enter the number of locks sold or enter -1 to exit");
		locks = sc.nextInt();
	}


	if(locks <= 70 && stocks <= 80 && barrels <= 90)
	{
		total = (one_lock * l) + (one_stock * s) + (one_barrel * b);

		if (total <= 1000)
		{
			commission = 0.1 * total;
		}
		
		else if(total >= 1800) 
		{
			commission = (0.1*1000)+(0.15*800)+(total-1800)*0.2;
		}

		else
		{
			commission = (0.1*1000)+(total-1000)*0.15;
		}	
		/*else
		{
		}*/
		System.out.println("Commission is " + commission);
		System.out.println("The total cost is " + total);
	}
	else
	{
		System.out.println("Invalid Input");
	}
}

}

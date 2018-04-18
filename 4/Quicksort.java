import java.util.*;
import java.io.*;
class Quicksort
{

	static void quicksort(int[] x,int first,int last)
	{
		//x = new int[n];
		int temp,pivot,i,j;
		if(first < last)
		{
			pivot = first;
			i = first;
			j = last;
			while(i<j)
			{
				while(x[i]<=x[pivot] && i<last)
				{
					i++;
				}
				while(x[j] > x[pivot])
				{
					j--;
				}
				if(i<j)
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			temp = x[pivot];
			x[pivot] = x[j];
			x[j] = temp;
			quicksort(x,first,j-1);
		   	quicksort(x,j+1,last);
		}
	}


	public static void main(String[] args)
	{
		int n,key,i;
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Enter the array elements");
			for(i=0;i<n;i++)
			{
				a[i] = sc.nextInt();	
			}

			quicksort(a,0,n-1);
			
			System.out.println("The sorted array elements are");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i] + "\t");
			}
		}
		else
		{
			System.out.println("Size of the array is invalid");
		}
	}

}

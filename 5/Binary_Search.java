import java.util.*;
import java.io.*;

class Binary_Search {

		public static int a[];
		static int key;
		static int n;
		

		public static void main(String[] args)
		{
			int i;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			n = sc.nextInt();
			a =new int[n+1];
			System.out.println("Enter the array elements :)");
			for(i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			System.out.println("The array elements are:");
			for(i=0;i<n;i++)
			{
				System.out.println(a[i] + "\t");
			}
			System.out.println("Enter the key to be searched");
			key = sc.nextInt();
			binary_search(0,n-1,key);
		}

		public static int binary_search(int low,int high,int key)
		{
			int mid;
			while(low<=high)
			{
				mid = low + (high-low)/2;
				if(key == a[mid])
				{
					System.out.println("Element found at pos " + (mid+1));
					return mid;

				}
				else if(a[mid] < key)
				{
					low = mid + 1;
				}
				else if(a[mid] > key)
				{
					high = mid -1;

				}
			}
			System.out.println("Element not found");
			return -1;


			
		}
}
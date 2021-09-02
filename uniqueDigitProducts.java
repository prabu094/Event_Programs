/*Saranya bought an array and she thought to reduce it. Instead of simply rejecting the decided to find the unique product of digits in it. 
The product of digits is found by mu the digits of the given numbers in the array. After finding the products, the unique pro counted. 
Given an array of integers of length N, write a program to check the number
in it.
Example
Input

6

28 121 43 222 29

Output

4

Explanation

For a= [2, 8, 121, 43, 222, 29], the output should be

uniqueDigitProducts(a) = 4. Here are the products of the array's elements:

2: product (2) = 2; 8: product(8) = 8;

121: product(121)=1*2*1 = 2; 43: product(42) = 4*3= 12;

222: product (222) = 2*2*2=8; 29: product (29) = 2*9 = 18.

As you can see, there are only 4 different products: 2,8,12 and 18.*/


import java.util.Scanner;
class Main
{   
static int getProduct(int n)
	{
		int product = 1;

		while (n != 0) {
			product = product * (n % 10);
			n = n / 10;
		}

		return product;
	
}
static int countDistinct(int arr[], int n)
{
    int res = 1;
    for (int i = 1; i < n; i++)
    {
        int j = 0;
        for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
        if (i == j)
            res++;
    }
    return res;
}
public static void main (String[] args)
	{		
	int[] arr;
	int n=0;
	Scanner sc=new Scanner(System.in);  
	n=sc.nextInt();
	arr = new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}

	for (int i = 0; i < arr.length; i++)
	    
		arr[i]=getProduct(arr[i]);
		
System.out.println("countDistinct " + countDistinct(arr, n));
		    
	}
}

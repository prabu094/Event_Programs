/*The students are new to coding and their teacher gave them a simple task to start with given a positive integer n
witte a program to output the string representation of all the numbers from 1 to n inclusive while replacing multiples of m1 with happy,
multiples of m2 with coding and multiples of both m1 and m2 with happy coding 
example:
input 
10 
2 

output
1 Happy 3 Happy Coding Happy 7 Happy 9 HappyCoding
Happy - 4
Coding - 1
HappyCoding - 1*/


import java.util.Scanner;
 
public class Main {
 
   public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	int n = reader.nextInt();
	int a=0,b=0,c=0;
	int m1 = reader.nextInt();
	int m2 = reader.nextInt();
	for(int i=1;i<=n;i++){
	    if (i%m1==0 && i%m2==0){
	        
	        c=c+1;
	        System.out.print(" HappyCoding ");
	        continue;
	    }
	  else if(i%m1==0){
	        a=a+1;
	        System.out.print(" Happy ");
	        continue;
	        
	    }
	    else if (i%m2==0){
	        b=b+1;
	        System.out.print(" Coding ");
	        continue;
	    }
	    else
	    {
	        System.out.print(i);
	    }
	}
	System.out.println();
	System.out.println("Happy - "+a);
	System.out.println("Coding - "+b);
	System.out.println("HappyCoding - "+c);
   }
}

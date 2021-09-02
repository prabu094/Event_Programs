/*Ram and Mohan are two brothers. They are not good at maths. So their father decided to gi assignments as a game so that
they can enjoy as well as they can learn the concept of num systems. So he gave two numbers to them.
One is the sum of two numbers, x and y, and an product of the same two numbers. Help them to write a code to find x and y.
Note:
The two numbers should be printed in ascending order.
Example 1
Input
56

Output
23

Explanation
If we sum the numbers 2 and 3 we get the first input value 5 and if we multiply 2 and 3 we c second input value 6. Hence the output is 2 and 3
Example 2
Input
15 50

Output
5 10
*/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner val = new Scanner(System.in);
	    int a = val.nextInt();
      int count=0;
	    int b = val.nextInt();
	    for(int i=0;i<a;i++)
	    {
	        for(int j=0;j<b;j++)
	        {
	            if((i+j == a) && (i*j == b))
	            {  count=1;
	                System.out.print(i);
	                System.out.print(" "+j);
                  break;
	            }
	        }
          if(count==1){
            break;
          }
	    }

	}
}

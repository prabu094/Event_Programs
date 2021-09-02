/*You can rearrange zbk to be zkb (by switching the k and the b) Hence the output is 'Yes'

Example :

input: Mem 
input: Coding

Output no
*/


import java.util.*;
import java.util.Scanner;
class Main {
static boolean arePermutation(String str1, String str2)
{
	int n1 = str1.length();
	int n2 = str2.length();
	if (n1 != n2)
	return false;
	char ch1[] = str1.toCharArray();
	char ch2[] = str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	for (int i = 0; i < n1; i++)
	if (ch1[i] != ch2[i])
		return false;
	return true;
}
public static void main(String[] args)
{   Scanner sc= new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	if (arePermutation(str1, str2))
	System.out.println("Yes");
	else
	System.out.println("No");

}
}

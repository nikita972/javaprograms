//display all words whose characters is match with enterd character.(input=dog got age, character=g, output=dog,got)

package tss;

import java.util.Scanner;

public class StrFindChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//A#B1C.2/@"
		System.out.println("enter a string");
		String str=sc.nextLine();
		System.out.println("enter a character from string");
		char c=sc.next().charAt(0);
		String[] a=str.split(" ");
		int i,j,flag=0,flag2=0;
		char c1[];
		for(i=0;i<a.length;i++)
		{
			flag=0;
			c1=a[i].toCharArray();
			for(j=0;j<c1.length;j++)
			{
				if(c1[j]==c)
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(a[i]);
				flag2=1;
			}
		}
		if(flag2==0)
		{
			System.out.println("there is nomatching charater is found from string");
		}

	}

}

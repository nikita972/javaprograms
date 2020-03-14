//seperate characters,numbers and spacial characters from string and place all characters first,then numbers and then spacial characters.

package tss;
import java.util.Scanner;
public class CharNoSpl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//A#B1C.2/@"
		System.out.println("enter a string which contains characters numbers and spacial charactes");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		char c1[]=new char[c.length];
		int i,j=0;
		for(i=0;i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z' || c[i]>='a' && c[i]<='z')
			{
				c1[j]=c[i];
				++j;
				c[i]=' ';
			}
		}
		for(i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				c1[j]=c[i];
				++j;
				c[i]=' ';
			}
		}
		for(i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				c1[j]=c[i];
				++j;
			}
		}
		String str2=new String(c1);
		System.out.println("string is="+str2);

	}

}

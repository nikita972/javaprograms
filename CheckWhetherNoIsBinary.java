//check whether a given number is binary

package mains_pkg;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckWhetherNoIsBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter a number");
		str=sc.next();
		char[] c=str.toCharArray();
		int i,j,sum=0,p = 0,cnt=0;
		String str2="";
		ArrayList<Integer> a=new ArrayList();
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='0' || c[i]=='1')
			{
				cnt++;
			}
		}
		if(cnt==c.length)
		{
			System.out.println("number is binary");
		}
		else
		{
			System.out.println("number is not binary");
		}

	}

}

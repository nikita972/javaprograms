package mains_pkg;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestOddDigites {

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
			
			
			if(c[i]%2!=0)
			{
				a.add((int)c[i]);
				cnt++;
			}
			
		}
		Object[] o=a.toArray();
		int[] c2=new int[cnt];
		for(i=0;i<o.length;i++)
		{
			p=(int) o[i];
			c2[i]=p-48;
			//System.out.println(c2[i]);
		}
		for(i=0;i<c2.length;i++)
		{
			for(j=0;j<c2.length-1;j++)
			{
				if(c2[j+1]<c2[j])
				{
					int t=c2[j];
					c2[j]=c2[j+1];
					c2[j+1]=t;
				}
			}
		}
		for(i=0;i<c2.length-1;i++)
		{
			sum=sum+c2[i];
			str2=str2+c2[i];
		}
		if(c2.length-1>1)
		{
			System.out.println("smallest odd digits "+str2+" whose addion is even");
		}
		else
		{
			System.out.println("there is no smallest odd digits  whose addion is even");
		}

	}

}

//if you enter string it display count of characters(input=aaabbccaaddc, output=a3b2c2a2d2c1)
//if you enter count of character it display string(input=a3b2c2a2d2c1, output=aaabbccaaddc)
package tss;

import java.util.Scanner;

public class CountCharAndNoToChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		System.out.println(str);
		String str2="";
		char[] c=str.toCharArray();
		int i,j,cnt=1,res,sum=0,k,m=0;
		if(c[1]>='0' && c[1]<='9')
		{
			res=1;
		}
		else
		{
			res=0;
		}
		//System.out.println(res);
		if(res==0)
		{
			for(i=0;i<c.length;i++)
			{
				cnt=1;
				for(j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						cnt++;
						c[j]=0;
					}
					else
					{
						break;
					}
				}
				if(c[i]!=0)
				{
					str2=str2+c[i]+cnt;
				}
			}	
			System.out.println(str2);
		}
		else
		{
			for(i=0;i<c.length;i++)
			{
				
					if(c[i]>='0' &&c[i]<='9')
					{
						sum=sum+c[i]-48;
					}
			}
			char c1[]=new char[sum];
			for(i=0;i<c.length;i=i+2)
			{
				j=i;
				++j;
				for(k=0;k<(int)c[j]-48;k++)
				{
					c1[m]=c[i];
					++m;
				}
			}
			str2=new String(c1);
			System.out.println(str2);
		}
		
	}

}

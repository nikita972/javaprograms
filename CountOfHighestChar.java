//count hight count of character in sequence wise only.
package tss;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CountOfHighestChar {

	public static void main(String[] args)throws IOException {
		int i,cnt=0,j,cnt2=1,max= 0;
		char c,char1 = 0;
		String s="ssmmaaabbbbccdbeee";
			FileOutputStream fout=new FileOutputStream("D:/str.txt");
			byte[] b=s.getBytes();
		
			fout.write(b);
			ArrayList a=new ArrayList();
			FileInputStream fin=new FileInputStream("D:/str.txt");
				while((i=fin.read())!=-1)
				{
					c=(char)i;
					System.out.print(c);
					a.add(c);
					cnt++;
				}
				char[] a1=new char[cnt];
				for(i=0;i<cnt;i++)
				{
					a1[i]=(char) a.get(i);
				}
				for(i=0;i<cnt;i++)
				{
					cnt2=1;
					for(j=i+1;j<cnt;j++)
					{
						if(a1[i]==a1[j] && a1[j]!=0)
						{
							cnt2++;
							a1[j]=0;
						}
						else
						{
							break;
						}
					}
					if(a1[i]!=0 && cnt2>max)
					{
						max=cnt2;
						char1=a1[i];
					}
					
				}
				System.out.println(" ");
				System.out.println(char1+" occurs "+max);
				
	}

}

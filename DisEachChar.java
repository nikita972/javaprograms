//display only once each character from string.
package tss;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DisEachChar {

	public static void main(String[] args) throws IOException {
	
				int i,cnt=0,j,cnt2=1,max= 0;
				char c,char1 = 0;
				String s="ssmmaaabbbbccdbeeess";
				System.out.println(s);
					FileOutputStream fout=new FileOutputStream("D:/str.txt");
					byte[] b=s.getBytes();
				
					fout.write(b);
					ArrayList a=new ArrayList();
					FileInputStream fin=new FileInputStream("D:/str.txt");
						while((i=fin.read())!=-1)
						{
							c=(char)i;
							a.add(c);
							cnt++;
						}
						char[] a1=new char[cnt];
						for(i=0;i<cnt;i++)
						{
							a1[i]=(char) a.get(i);
						}
						System.out.println(" ");
						System.out.println("these characters present in sttring ");
						for(i=0;i<cnt;i++)
						{
							cnt2=1;
							for(j=i+1;j<cnt;j++)
							{
								if(a1[i]==a1[j] && a1[j]!=0)
								{
									
									a1[j]=0;
								}
								else
								{
									break;
								}
							}
							if(a1[i]!=0)
							{
								
								System.out.print(a1[i]);
							}
							
						}
						
	
}

}

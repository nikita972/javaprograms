//Give space in between each and every character from string.

package tss;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class SstrWithSpace {

	public static void main(String[] args) throws IOException {
		String str="abc";
		ArrayList a=new ArrayList();
		int i,cnt = 0,j=0;
		char c,e,d;
		FileOutputStream out=new FileOutputStream("D:/StrSpace.txt");
		byte[] b=str.getBytes();
		out.write(b);
		FileInputStream fin=new FileInputStream("D:/StrSpace.txt");
		while((i=fin.read())!=-1)
		{
			c=(char)i;
			a.add(c);
			cnt++;
		}
	
		char[] c1=new char[cnt];
		char[] c2=new char[cnt+cnt-1];
		for(i=0;i<cnt;i++)
		{
			c1[i]=(char)a.get(i);
		}
	
		for(i=0;i<cnt;i++)
		{
			e=c2[j]=c1[i];
			j=j+2;
		}
		j=1;
	for(i=0;i<cnt-1;i++)
	{
		d=c2[j]=' ';
		j=j+2;
	}
		
		String str2=new String(c2);
		str=str2;
		System.out.println(str);
	}
}

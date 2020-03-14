package tss;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class aseArray {

	public static void main(String[] args) throws IOException {
		String str="810129";
		ArrayList<Integer> a=new ArrayList();
		int i,cnt = 0,j;
		int c;
		FileOutputStream out=new FileOutputStream("D:/ascno.txt");
		byte[] b=str.getBytes();
		out.write(b);
		FileInputStream fin=new FileInputStream("D:/ascno.txt");
		while((i=fin.read())!=-1)
		{
			c=i-48;
			a.add(c);
			cnt++;
		}
	
		int[] c1=new int[cnt];
		for(i=0;i<cnt;i++)
		{
			c1[i]=a.get(i);
		}
		for(i=0;i<cnt;i++)
		{
			for(j=0;j<cnt-1;j++)
			{
				if(c1[j+1]<c1[j])
				{
					int t=c1[j];
					c1[j]=c1[j+1];
					c1[j+1]=t;
				}
			}
		}
		for(i=0;i<cnt;i++)
		{
			System.out.print(c1[i]);
		}
	}

}

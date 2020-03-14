//removing trealing and leading white spaces.

package tss;
public class RemoveWhitespce {

	public static void main(String[] args) {
	String str="  abc mm cc   ";
	int cnt=0,j=0,i;
	char[] c=str.toCharArray();
	for(i=0;i<c.length;i++)
	{
		if(c[i]==' ')
		{
			cnt++;
		}
		else
		{
			break;
		}
	}
	char[] c1=new char[c.length-cnt];
	for(i=cnt;i<c.length;i++)
	{
		c1[j]=c[i];
		j++;
	}
	cnt=0;
	for(i=c1.length-1;i>=0;i--)
	{
		if(c1[i]==' ')
		{
			cnt++;
		}
		else
		{
			break;
		}
	}
	j=0;
	char[] c2=new char[c1.length-cnt];
	for(i=0;i<c2.length;i++)
	{
		c2[j]=c1[i];
		j++;
	}
	cnt=0;
	for(i=0;i<c2.length;i++)
	{
		if(c2[i]==' ')
		{
			cnt++;
		}
		System.out.print(c2[i]);
	}
	System.out.println(cnt);
	}
}

//count number of characters from string
package tss;
public class countchar {

	public static void main(String[] args) {
		String str="aaabbccaaddc";
		String str2="";
		char[] c=str.toCharArray();
		int i,j,cnt=1;
		for(i=0;i<c.length;i++)
		{
			cnt=1;
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && c[j]!=0)
				{
					cnt++;
					c[j]=0;
				}
			}
			if(c[i]!=0)
			{
				System.out.println(c[i]+" occurs "+cnt);
			}
			
		}
		
	}

}

//count number of characters,numbers and spacial characters from string
package tss;

public class CountAlphaNoSpl {

	public static void main(String[] args) {
	String str="a66BC 45*S    %@";
	int cnt1=0,cnt2=0,cnt3=0;
	char[] c=str.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='a' && c[i]<='z' || c[i]>='A' && c[i]<='Z')
		{
			cnt1++;
		}
		else if(c[i]>='0' && c[i]<='9')
		{
			cnt2++;
		}
		else if(c[i]!=' ')
		{
			cnt3++;
		}
	}
	System.out.println(cnt1+" "+cnt2+" "+cnt3);

	}

}

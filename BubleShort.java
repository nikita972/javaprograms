package tss;

public class BubleShort {

	public static void main(String[] args) {
		int a[]={5,2,6,-6,0,-1};
		int s=a.length,i,j,min;
		for(i=0;i<s;i++)
		{
			min=i;
			for(j=i+1;j<s;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int t=a[min];
			a[min]=a[i];
			a[i]=t;
		}
		for(i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
	}

}

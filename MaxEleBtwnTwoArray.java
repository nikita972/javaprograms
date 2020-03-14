package tss;
public class MaxEleBtwnTwoArray {

	public static void main(String[] args) {
	int[] a={10,11,15,48,20,148,5,45,48,30};
	int[] b={0,1,5,7,8};
	int i,j,max=0;
	for(i=0;i<b.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			if(b[i]==j)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
				break;
			}
		}
	}
	System.out.println(max);

	}

}

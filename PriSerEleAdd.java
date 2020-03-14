//addition of primary and secondary diagonal elements.

package tss;
public class PriSerEleAdd {

	public static void main(String[] args)
	{
		int a[][]={{5,3,2},{1,6,3},{5,3,3}};
		int i,j,s=a.length,sum1=0,sum2=0;
		/*for(i=0;i<s;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				sum1=sum1+a[i][j];
			}
		}*/
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
				{
					sum1=sum1+a[i][j];
				}
			}
		}
		j=3-1;
		for(i=0;i<3;i++)
		{
			sum2=sum2+a[i][j];
			j--;
		}
		System.out.println("addition of primary dialgonal elements is="+sum1);
		System.out.println("addition of secondary dialgonal elements is="+sum2);

	}

}

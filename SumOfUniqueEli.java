//sum of unique elements from two array.
package tss;
public class SumOfUniqueEli {

	public static void main(String[] args) {
		int a[]={1,2,3,};
		int b[]={2,4,5,3};
		int i,j,sum1=0,sum2=0,cnt=0,alen=a.length,blen=b.length;
		System.out.println("fist array");
		for(i=0;i<alen;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("seccond array");
		for(i=0;i<blen;i++)
		{
			System.out.print(b[i]+" ");
		}
		for(i=0;i<alen;i++)
		{
			cnt=0;
			for(j=0;j<blen;j++)
			{
				if(a[i]==b[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				sum1=sum1+a[i];
			}
			
		}
		for(i=0;i<blen;i++)
		{
			cnt=0;
			for(j=0;j<alen;j++)
			{
				if(b[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				sum2=sum2+b[i];
			}
			
		}
		System.out.println(" ");
		System.out.println("sum of unique elements from two array");
		System.out.println(sum1+sum2);

	}

}

//display such elements which left and right elements addition is equal to that element.

package tss;
public class LeftRightEleAdd {

	public static void main(String[] args) {
		//int a[]={2,3,5,20,60,20,5,3,2};
		int a[]={5,10,20,122,30,12,9,36};
		int i,j,sum1=0,sum2=0,k,sum3=0;
		for(i=0;i<a.length;i++)
		{
			sum1=0;
			sum2=0;
			for(j=0;j<i;j++)
			{
				sum1=sum1+a[j];
				
			}
			for(k=i+1;k<a.length;k++)
			{
				sum2=sum2+a[k];
			}
			sum3=sum1+sum2;
			if(a[i]==sum3)
			{
				System.out.println(a[i]);
			}
		}

	}

}

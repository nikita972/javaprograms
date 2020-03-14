//display elements in desedending order.
package tss;

public class DesEleArray {

	public static void main(String[] args) {
		int a[]={2,9,6,-6,3,0,-1};
		int i,s=a.length,j;
		for(i=0;i<s-1;i++)
		{
			j=i+1;
			if(a[j]>a[i])
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		for(i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
	}

}

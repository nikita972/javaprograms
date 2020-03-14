//display maximum difference between two elements from array but the smallest element index is less then largest element index.
package tss;
public class diffmaxandsmall {

	public static void main(String[] args) {
		int[] a={0,50,60,-3,-10,100,-50};
		int s=a.length;
		int j=0,i,min=a[0],max=a[0],minindx=0,maxindx=0,k,ll=0;
		
			for(i=0;i<s;i++)
			{
				if(a[j]<a[i])
				{
					k=a[i]-a[j];
					if(k>ll)
					{
						min=a[j];
						max=a[i];
						ll=k;
					}
				}
				if(i==s-1)
				{
					i=0;
					j++;
					if(j==s-1)
					{
						break;
					}
				}
			}
		
		System.out.println("maximum difference between two elements from array are "+min+" and "+max);
	}

}

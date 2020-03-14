package tss;

//find same word from array(but character in different position or same position) and display it.
public class FindSameWord {

	public static void main(String[] args) {
		String[] a={"eat","tea","tan","ate","nat","bat"};
		
		int i,j,k,l,cnt=0;
		String str;
		char c1[];
		char c2[];
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("[");
		for(i=0;i<a.length;i++)
		{
			str="";
			if(a[i]!=null)
			{
				c1=a[i].toCharArray();
				for(j=i;j<a.length;j++)
				{
					cnt=0;
					if(a[j]!=null)
					{
						c2=a[j].toCharArray();
						
						//System.out.println(" ");
						for(k=0;k<c1.length;k++)
						{
							for(l=0;l<c2.length;l++)
							{
								if(c1[k]==c2[l])
								{
									cnt++;
									
								}
							}
							
						}
						if(cnt==c1.length && a[j]!=null)
						{
							if(str=="")
							{
								str=str+a[j];
								a[j]=null;
							}
							else
							{
								str=str+","+a[j];
								a[j]=null;
							}
							
						}
					}
					
				}
				System.out.println("["+str+"]");
			}
			
		}
		System.out.println("]");
	}

}

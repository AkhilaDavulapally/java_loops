class Max_value 
{
	public static void main(String[] args) 
	{
		int a[][]={{10,5,12},{15,30,18},{20,15,6}};
		System.out.println("The given array is:");
		for(int i=0;i<=(a.length)-1;i++)
		{
			System.out.print("{");
		    for(int j=0;j<=(a[i].length)-1;j++)
			{
			  System.out.print(a[i][j]+",");
			}
			 System.out.println("}");
		}
		System.out.println("Maximum value from each subarray");
		int product=1;
		for(int i=0;i<=(a.length)-1;i++)
		{  
			int min=a[i][0];
			
		    for(int j=0;j<=(a[i].length)-1;j++)
			{
			  
              
			  if(min>a[i][j])
				{
				  min=a[i][j];
				  
				}
			}
			
		 product=product*min;
		}
		 System.out.println(product);
		
		
		
			
		

	}
}

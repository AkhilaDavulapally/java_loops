class Positive_value 
{
	public static void main(String[] args) 
	{
		int a[][]={{10,-5,12},{15,30,-18},{-20,15,6}};
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
		    
			 for(int i=0;i<=(a.length)-1;i++)
		     {  
			
			
		      for(int j=0;j<=(a[i].length)-1;j++)
			   {
		
		          if(a[i][j]==0)
		           {
			         System.out.println(a[i][j]+ "is positive number");
		           }
				   else
				   {
					   System.out.println(a[i][j]+"is negative number");
				   }
		       }
			 }
		
		       
	
	}
}

			
			
		
		
		
		
			
		

	



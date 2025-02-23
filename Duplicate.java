class  Duplicate
{
	public static void main(String[] args) 
	{
		
		int a[]={8,2,2,6,6,15};
	    for(int i=0;i<=(a.length)-1;i++)
		   {
			 for(int j=i+1;j<(a.length)-1;j++)
			  {
				if(a[i]==a[j])
				{
					
				  System.out.println("Duplicate values are"+a[i]);
				  break;
				}
			  }
		   }
			  
	
				

	


	

	}
}




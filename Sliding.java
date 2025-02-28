class  Sliding 
{
	public static void main(String[] args) 
	{
		int a[]={2,-1,9,5,4,0};
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[j];
				}
			}
		}

		System.out.println("result[]={");
		for(int i:a)
		{
			System.out.println(i+ ",");
		}
		System.out.println("}");
	}
}

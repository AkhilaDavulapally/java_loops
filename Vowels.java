class Vowels 
{
	public static void main(String[]args)
	{
		vowels();
	}

	public static void vowels() 
	{

	for(char ch='A';ch<='Z';ch++)
		{
		 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{


			   System.out.println(ch+"is a vowel");
			}
			
		}
	}
}
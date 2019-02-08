package sele;

public class Pattern {

	public static void main(String[] args) {
		int nline=11;
		int mid=(nline/2)+1;
int mid1=(mid/2)+1;
int mid2=((nline-mid)/2)+1;
int k=1;
int i;
for(i=0;i<=mid1;i++)

		{
			for(int j=0;j<=i;j++)
		{
				System.out.print("*");
				}
		System.out.println();}
	for(i=0;i<=mid1;i++)
	{
		for(int j=mid1-1;j>=0;j--)
		{
			if(j>=i)
			{
			System.out.print("*");	
			}
		}System.out.println();
	}
	
	for(i=0;i<=mid1+1;i++)
	{
		for(int j=0;j<=i;j++)
	{
			System.out.print("*");}
	System.out.println();
	}
	
	for(i=0;i<=mid1;i++){
		for(int j=mid2;j>=0;j--)
		{
			if(j>=i)
			{
			System.out.print("*");	
			}
		}System.out.println();
	
	}
	}
	}



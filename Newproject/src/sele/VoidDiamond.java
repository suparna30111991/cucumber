package sele;

public class VoidDiamond {

	public static void main(String[] args) {
		int n=8;
		int mid=n/2;
		int space=n-1;
		int star=1;
		
		for(char i=65;i<=69;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{if(k==1||k==star)
				{
				System.out.print(i);
				
				}
			else {System.out.print(" ");}
			}
			star=star+2;
			space--;
		System.out.println();}
		for(char i=70;i>=65;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{if(k==1||k==star)
				{System.out.print(i);}
			else {System.out.print(" ");}
			}
			star=star-2;
			space++;
		System.out.println();}



	}

}

package sele;

public class Doorstar {

	public static void main(String[] args) {
		int n=4;
		int star=8;
		int mid=4;
		int space=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
				
			}
			for(int k=0;k<=space;k++)
			{
				{
					System.out.print(" ");
				}
				
			}System.out.println();
			space=space+2;
		}

	}

}

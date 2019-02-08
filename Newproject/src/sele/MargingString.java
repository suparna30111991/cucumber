package sele;

public class MargingString {

	public static void main(String[] args) {
		String str1="lkjihgfedcba";
		String str2="LKJIHGFEDCBA";
		String f="";
		for(int i=0;i<str1.length()-1;i++)
		{
			f=f+(str1.charAt((str1.length()-1)-i))+(str2.charAt((str2.length()-1)-i));
		}
System.out.println(f);
	}

}

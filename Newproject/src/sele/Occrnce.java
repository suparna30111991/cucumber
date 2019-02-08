package sele;

public class Occrnce {

	public static void main(String[] args) {
		String str="Himalyaas";
int count=0;
char[] ch=str.toCharArray();
for(int i=0;i<=ch.length-1;i++)

	{if(ch[i]=='a')
	{count++;}
		}
System.out.println("no of 'a' in the string is "+count);
	}
	}



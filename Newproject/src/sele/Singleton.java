package sele;

public class Singleton {
static Singleton ref=new Singleton();
private Singleton()
{
	System.out.println("Singleton class");
	}
void m(int a,int b)
{
	int result=a+b;
	System.out.println("result is "+result);
	
	}
}

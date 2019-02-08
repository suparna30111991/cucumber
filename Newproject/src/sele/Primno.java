package sele;

public class Primno {

	public static void main(String[] args) {
		  int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for(i=0;i<=50;i++)
	       {int count=0;
	    	   for(num=i;num>=1;num--)
	    	   {
	    		   { if(i%num==0)
	    		   count++;}}
	    	   
	    	   { if(count==2)
	    	   {
	    		   primeNumbers= primeNumbers+i+",";
	    	   }}
	       }System.out.println(primeNumbers);
	}

}

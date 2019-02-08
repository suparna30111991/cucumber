package sele;

import sele.Outercls.Innerclass;

public class MainclassforInnercls {

	public static void main(String[] args) {
		//Outercls.Innerclass iref=new Outercls.Innerclass();
		Outercls oref=new Outercls();
		Innerclass iref=oref.new Innerclass();
		System.out.println(iref.i);
		System.out.println(iref.d);
		System.out.println(iref.c);
		System.out.println(iref.str);
		System.out.println(iref.b);
		iref.i=89;
		iref.d=6.5;
		iref.c='p';
		iref.str="Suparna";
		iref.b=true;
		System.out.println(iref.i);
		System.out.println(iref.d);
		System.out.println(iref.c);
		System.out.println(iref.str);
		System.out.println(iref.b);
		iref.mtd();
		
		System.out.println(oref.h);
		oref.h=683;
		System.out.println(oref.h);

	}

}

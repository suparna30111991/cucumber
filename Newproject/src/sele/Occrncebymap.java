package sele;

import java.util.HashMap;
import java.util.Map;

public class Occrncebymap {

	public static void main(String[] args) {
		String str="java";
		Map map=new HashMap();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			int count=1;
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), ++count);
			}else {
				map.put(str.charAt(i), count);
			}
		}System.out.println(map);

	}

}

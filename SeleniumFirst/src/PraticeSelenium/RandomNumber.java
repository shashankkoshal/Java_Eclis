package PraticeSelenium;

import java.util.Random;

public class RandomNumber {
	
	public static String random_no()
	{
		Random rd = new Random();
		int r = rd.nextInt(1000);
		//System.out.println(rd.nextInt(10000));
        return "testid_"+r +"@gmail.com";
	}
	
        public static String random_pass()
        {
        	Random p = new Random();
        	String k = p.toString();
        	System.out.println(p);
        	return "p"+k;
        }
		
		
	}

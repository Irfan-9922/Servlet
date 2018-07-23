package com.ij;

import java.util.Calendar;

import javax.jws.WebService;

@WebService
public class demo {
	public String getName(String name)
	{
		Calendar cal=Calendar.getInstance();
		String msg=null;
		int h=0;
		h=cal.get(Calendar.HOUR_OF_DAY);
		if(h<=12)
			msg="good morning";
		else if(h>12 && h<20)
          msg="good evining";
		else
			msg="good night";
			return "welcome"+ msg+name;
					
	}

}

package com.ij;

import javax.jws.WebService;

@WebService
public class ihelloservice {
	public String syhello(String name){
		return "welcome "+name+"to web services ";
	}

}

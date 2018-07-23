package com.ij;

import javax.xml.ws.Endpoint;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String endpointurl="http://localhost:1512/deee?wsdl";
      demo d=new demo();
      Endpoint.publish(endpointurl, d);
      System.out.println("webservices deployd succesfully");
	}

}

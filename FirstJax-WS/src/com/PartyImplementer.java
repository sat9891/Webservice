package com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.Party")
public class PartyImplementer implements Party {

	@WebMethod(operationName="partyInvoker")
	@Override
	public String display(String name) {

		return "Provide Party name is"+name;
	}

}

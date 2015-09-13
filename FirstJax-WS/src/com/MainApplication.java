package com;

import javax.xml.ws.Endpoint;

public class MainApplication {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:9191/party", new PartyImplementer());
	}

}

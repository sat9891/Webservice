package com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ValidateWSDL {

	public static int getResponseCode(String urlString)
			throws MalformedURLException, IOException {
		URL u = new URL(urlString);
		HttpURLConnection huc = (HttpURLConnection) u.openConnection();
		huc.setRequestMethod("GET");
		huc.setRequestProperty(
				"User-Agent",
				"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");
		huc.connect();
		return huc.getResponseCode();
	}

	public static void main(String[] args) throws MalformedURLException,
			IOException {

		String urlStr = "http://localhost:9191/party?wsdl";
		URL url = null;
		URLConnection urlConnection = null;
		try {
			url = new URL(urlStr);
			urlConnection = url.openConnection();
			if (urlConnection.getContent() != null) {
				System.out.println("GOOD URL");
			} else {
				System.out.println("BAD URL");
			}
		} catch (MalformedURLException ex) {
			System.out.println("bad URL");
		} catch (IOException ex) {
			System.out
					.println("Failed opening connection. Perhaps WS is not up?");
		}

		//UrlValidator urlValidator = new UrlValidator();
		//boolean check = urlValidator
			//	.isValid("http://localhost:9191/party?wsdl");

		/*if (check == true) {
			System.out.println("right url");
		} else {
			System.out.println("wrong url");
		}*/
		int code = getResponseCode("http://localhost:9191/party?wsdl");
		if (code == 200) {
			System.out.println("correct url");
		} else {
			System.out.println("wrong url");
		}

	}

}

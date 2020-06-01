package com.java9.features.http2;


import java.net.URI;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class Http2Example {
	public static void main(String[] args) throws Exception {
		HttpClient client = HttpClient.newHttpClient();
		String url ="https://postman-echo.com/get?foo1=bar1&foo2=bar2";
		HttpRequest request =HttpRequest.newBuilder(new URI(url)).GET().build(); 
		//HttpResponse response = client.send(request, HttpResponse.BodyHandler.asString());
		HttpResponse response = client.send(request, HttpResponse.BodyHandler.asFile(Paths.get("sample.html")));
		System.out.println("API Response");
		System.out.println("Status :"+response.statusCode());
		System.out.println("Body or Content :"+response.body());
		Map<String,List<String>> map = response.headers().map();
		map.forEach((k,v) -> System.out.println(k +" / "+v));
		
	}
}

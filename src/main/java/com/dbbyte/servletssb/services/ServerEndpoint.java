package com.dbbyte.servletssb.services;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

/**
 * 
 * @author adrian
 * custom endpoint implementaion to display server info's
 */

@Component
public class ServerEndpoint implements Endpoint<List<String>> {

	public String getId() {
		return "myserverinfo";
	}

	public List<String> invoke() {
		List<String> serverDetails = new ArrayList<String>();
		try {
			serverDetails.add("Server IP Address : " + InetAddress.getLocalHost().getHostAddress());
			serverDetails.add("Server OS : " + System.getProperty("os.name").toLowerCase());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serverDetails;
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isSensitive() {
		return false;
	}

}
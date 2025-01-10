package com.shamanth.SpringConf.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="api")
public class ApiConf {
	
	private String host;
	private int port;
	private String timeout;
	
	public ApiConf() {
		
	}
	public ApiConf(String host, int port, String timeout) {
		super();
		this.host = host;
		this.port = port;
		this.timeout = timeout;
	}
	@Override
	public String toString() {
		return "ApiConf [host=" + host + ", port=" + port + ", timeout=" + timeout + "]";
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	
	

}

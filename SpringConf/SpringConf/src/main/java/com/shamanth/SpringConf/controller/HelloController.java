package com.shamanth.SpringConf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shamanth.SpringConf.model.ApiConf;

@RestController
public class HelloController {
	
	@Autowired
	private ApiConf apiConf;
	
	Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/hello")
	public String getApiCon(){
		
		logger.info("hi this is contclass");
		return apiConf.getHost()+" "+apiConf.getPort()+" "+apiConf.getTimeout();
//		return apiconf;
	}
}

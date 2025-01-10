package com.shamanth.ProfileLearning.Resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${spring.datasource.url}")
	private String dburl;
	@Value("${messege : default message}")
	private String msg;
	@Value("${names.list}")
	private String[] sts;
	@Value("#{${mapValues}}")
	private Map<String, Integer> mpm;
	@RequestMapping("/hi")
	public String HeyHi() {
		return dburl;
	}
	@RequestMapping("/Yegidira")
	public String reply() {
		return msg;
	}
	@RequestMapping("giveList")
	public String[] StrList() {
		return sts;
	}
	@RequestMapping("giveMap")
	public Map<String, Integer> StrMap() {
		return mpm;
	}
}

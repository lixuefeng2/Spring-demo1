package com.lixuefeng.d1.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class MyController {

	@RequestMapping(value = "/getDateAndTime")
	public ModelAndView getDateAndTime() {
		LocalDateTime now =LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String date_time = dtf.format(now);
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("date_time", date_time);
		
		return new ModelAndView("showMessage", params);
	}
}

package com.iot.spring;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);//포멧=형식 
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/h", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {//로컬 지역 ,모델은 hom1페이지로 생각하자
		model.addAttribute("test","난테스트 입니다");
		model.addAttribute("text","난 텍스트입니다");
		
		return "home1";//servlet 에서 맵핑해준것같다?
	}
	@RequestMapping(value = "/h2", method = RequestMethod.GET)
	@ResponseBody
	public List<User> home1() {
		List<User> list= new ArrayList<User>();
		User user= new User();
		user.setName("홍길동");
		user.setAge(30);
		list.add(user);
		list.add(user);
		list.add(user);
		list.add(user);
		list.add(user);
		return list;
	}
	@RequestMapping(value = "/h3", method = RequestMethod.GET)
	@ResponseBody
	public List home() {
		List<String> list= new ArrayList<String>();
		list.add("명훈이");
		return list;
	}
}

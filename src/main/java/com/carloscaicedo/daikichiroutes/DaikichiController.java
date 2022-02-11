package com.carloscaicedo.daikichiroutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String welcome_page() {
		return "Welcome to Daikichi. Wonderful thinkgs are about to come for you";
	}
	
	
	@RequestMapping("/today")
	public String today_page() {
		return "Today is a great day to catch up on assigments and perhaps even to get ahead!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow_page() {
		return "Tomorrow will bring some deserve time with family, "
				+ "as well as some rest. And Tomorrow you'll have some time to code as well.!";
	}
	
	@GetMapping("/days_later")
	public String week_later_page() {
		return "In a few days you'll start a new live. Enjoy!";
	}
	

}



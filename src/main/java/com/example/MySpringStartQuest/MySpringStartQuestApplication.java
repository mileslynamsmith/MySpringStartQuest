package com.example.MySpringStartQuest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MySpringStartQuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringStartQuestApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String indexDoctor1(){
		return
		"<ul>"+
			"<li><a href='/doctor/1'>Doctor 1</a></li>" +
			"<li><a href='/doctor/2'>Doctor 2</a></li>" + 
			"<li><a href='/doctor/10'>Doctor 10</a></li>" + 
			"<li><a href='/doctor/13'>Doctor 13</a></li>" + 
		"</ul>";
	}
	@RequestMapping("/doctorWholist")
	@ResponseBody
	public String index(){
		return "<a href='https://en.wikipedia.org/wiki/The_Doctor_%28Doctor_Who%29#Actors'>Doctor Who list</a>";	
	}
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index1(){
		return "William Hartnell";
	}
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String index2(){
		return "Patrick Troughton";
	}
	@RequestMapping("/doctor/10")
	@ResponseBody
	public String index10(){
		return "David Tennant";
	}
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String index13(){
		return "Jodie Whittaker";
	}
}

package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

	@RequestMapping("/")
	public String root() {
		return "redirect:listForm"; // listForm으로 리다이렉트 됨
	}

//	
//	@RequestMapping("/")
//	@ResponseBody // 문자열 호출
//	public String root() {
//		return "root() 호출";
//	}

	@RequestMapping("/listForm")
	public String listForm() {
		return "listForm"; // "listForm.jsp" 디스패치 해줌
	}
}

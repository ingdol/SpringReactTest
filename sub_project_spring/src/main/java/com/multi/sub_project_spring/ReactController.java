package com.multi.sub_project_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ReactController {
	@RequestMapping("/")
	public String hello() {
		return "react/index";
	}
}

package com.shangzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("/tolist")
	public String toList() {
		return "list";
	}

	public void toAdd() {
		System.out.println("add");
		System.out.println("fdsa");
		System.out.println("szl1");
	}

}

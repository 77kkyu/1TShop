package com.study.shopmall.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value="/join")
	public String loginGet() {
		logger.info("?��?���??�� ?��?���? 진입");
		return "";
	}
	
	@RequestMapping(value="/login")
	public String joinGet() {
		logger.info("로그?�� ?��?���? 진입");
		return "";
	}
	
}

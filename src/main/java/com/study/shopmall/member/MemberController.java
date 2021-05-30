package com.study.shopmall.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value="/join")
	public String loginGet() {
		logger.info("회원가입 페이지 진입");
		return "";
	}
	
	@RequestMapping(value="/login")
	public String joinGet() {
		logger.info("로그인 페이지 진입");
		return "";
	}
	
}

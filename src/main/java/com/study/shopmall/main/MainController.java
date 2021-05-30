package com.study.shopmall.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	   
	   @RequestMapping(value = "/main")
	   public String viewMain() throws Exception {
	      logger.info("main 실행중.............");
	      return "main";
	   }
}

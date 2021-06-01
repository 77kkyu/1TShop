package com.study.shopmall.main;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.shopmall.items.service.ItemService;

@Controller
public class MainController {
	
	@Inject
	ItemService itemService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	   
	@RequestMapping(value = "/main")
	public ModelAndView viewMain(ModelAndView mv) {
		logger.info("main Ω««‡¡ﬂ.............");
		mv.setViewName("/main");
		mv.addObject("list", itemService.listItem());
		return mv;
   }
}

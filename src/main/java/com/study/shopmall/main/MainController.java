package com.study.shopmall.main;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.shopmall.items.service.ItemService;
import com.study.shopmall.items.vo.ItemVO;

@Controller
public class MainController {

	@Inject
	ItemService itemService;

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainListItem(Model model) throws Exception {
		logger.info("main 실행중.............");
		List<ItemVO> list;
		list = itemService.mainListItem();
		model.addAttribute("list", list);
		return "main";
	}

	@RequestMapping(value = "/list/cateList", method = RequestMethod.GET) public
		String cateList(Model model) throws Exception{
		logger.info("list 실행중............."); 
		List<ItemVO> list; 
		list = itemService.mainListItem(); 
		model.addAttribute("list", list); 
		return "list/cateList"; 
	}
  
 }

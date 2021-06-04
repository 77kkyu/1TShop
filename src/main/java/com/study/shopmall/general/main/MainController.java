package com.study.shopmall.general.main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.shopmall.general.items.service.ItemService;
import com.study.shopmall.general.items.vo.ItemVO;
import com.study.shopmall.general.utils.PagingVO;

@Controller
public class MainController {

	@Autowired
	private ItemService itemService;

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainListItem(Model model) throws Exception {
		logger.info("main 실행중.............");
		List<ItemVO> list;
		list = itemService.mainListItem();
		model.addAttribute("list", list);
		return "main";
	}

	@RequestMapping(value = "/list/cateList", method = RequestMethod.GET) 
	public String cateList(Model model, PagingVO pagingVO 
				, @RequestParam(value="nowPage", required=false)String nowPage
				, @RequestParam(value="cntPerPage", required=false)String cntPerPage) throws Exception {
		
		logger.info("list 실행중............."); 

//		int total = itemService.countItem();
//		if(nowPage == null && cntPerPage == null) {
//			nowPage = "1";
//			cntPerPage = "5";
//		} else if(nowPage == null) {
//			nowPage = "1";
//		} else if(cntPerPage == null) {
//			cntPerPage = "5";
//		}
//		pagingVO = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
//		model.addAttribute("paging", pagingVO);
//		model.addAttribute("viewAll", itemService.selectItem(pagingVO));
		List<ItemVO> list; 
		list = itemService.mainListItem(); 
		model.addAttribute("list", list); 
		return "list/cateList"; 
	}
  
 }

package com.study.shopmall.items.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.shopmall.items.dao.ItemDAO;
import com.study.shopmall.items.vo.ItemVO;

@Service
public class ItemServiceImpl implements ItemService {

	@Inject
	ItemDAO itemDAO;

	//메인 상품 목록
	@Override
	public List<ItemVO> mainListItem() throws Exception{
	
		return itemDAO.mainListItem();
	}

	@Override
	public List<ItemVO> cateList() throws Exception {
		
		return itemDAO.cateList();
	}
	
	
	
}

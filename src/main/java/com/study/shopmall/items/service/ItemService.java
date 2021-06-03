package com.study.shopmall.items.service;

import java.util.List;

import com.study.shopmall.items.vo.ItemVO;

public interface ItemService {
	
	public List<ItemVO> mainListItem() throws Exception;
	
	public List<ItemVO> cateList() throws Exception;
}

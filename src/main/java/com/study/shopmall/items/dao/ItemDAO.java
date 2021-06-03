package com.study.shopmall.items.dao;

import java.util.List;

import com.study.shopmall.items.vo.ItemVO;

public interface ItemDAO {
	
	public List<ItemVO> mainListItem() throws Exception;
	
	public List<ItemVO> cateList() throws Exception;
}

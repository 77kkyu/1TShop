package com.study.shopmall.general.items.service;

import java.util.List;

import com.study.shopmall.general.items.vo.ItemVO;
import com.study.shopmall.general.utils.PagingVO;

public interface ItemService {
	
	public List<ItemVO> mainListItem() throws Exception;
	
	public List<ItemVO> cateList() throws Exception;
	
//	//惑前 醚 肮荐
//	public int countItem();
//
//	//其捞隆 贸府 惑前 炼雀
//	public List<ItemVO> selectItem(PagingVO	pagingVO);
}

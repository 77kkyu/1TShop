package com.study.shopmall.general.items.service;

import java.util.List;

import com.study.shopmall.general.items.vo.ItemVO;
import com.study.shopmall.general.utils.PagingVO;

public interface ItemService {
	
	public List<ItemVO> mainListItem() throws Exception;
	
	public List<ItemVO> cateList() throws Exception;
	
//	//��ǰ �� ����
//	public int countItem();
//
//	//����¡ ó�� ��ǰ ��ȸ
//	public List<ItemVO> selectItem(PagingVO	pagingVO);
}

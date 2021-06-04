package com.study.shopmall.general.items.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.shopmall.general.items.vo.ItemVO;
import com.study.shopmall.general.utils.PagingVO;

public interface ItemMapper {
	
	public List<ItemVO> mainListItem() throws Exception;
	
	public List<ItemVO> cateList() throws Exception;
	
//	//��ǰ �� ����
//	public int countItem();
//
//	//����¡ ó�� ��ǰ ��ȸ
//	public List<ItemVO> selectItem(PagingVO	pagingVO);
}

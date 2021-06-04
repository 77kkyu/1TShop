package com.study.shopmall.general.items.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.shopmall.general.items.vo.ItemVO;
import com.study.shopmall.general.utils.PagingVO;

public interface ItemMapper {
	
	public List<ItemVO> mainListItem() throws Exception;
	
	public List<ItemVO> cateList() throws Exception;
	
//	//惑前 醚 肮荐
//	public int countItem();
//
//	//其捞隆 贸府 惑前 炼雀
//	public List<ItemVO> selectItem(PagingVO	pagingVO);
}

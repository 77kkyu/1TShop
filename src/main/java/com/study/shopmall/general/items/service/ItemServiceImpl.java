package com.study.shopmall.general.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.shopmall.general.items.mapper.ItemMapper;
import com.study.shopmall.general.items.vo.ItemVO;
import com.study.shopmall.general.utils.PagingVO;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	//메인 상품 목록
	@Override
	public List<ItemVO> mainListItem() throws Exception{
		return itemMapper.mainListItem();
	}
	
	//카테고리별 상품 목록
	@Override
	public List<ItemVO> cateList() throws Exception {
		return itemMapper.cateList();
	}

//	//상품 총 갯수
//	@Override
//	public int countItem() {
//		return itemMapper.countItem();
//	}
//	
//	//페이징 처리 상품 조회
//	@Override
//	public List<ItemVO> selectItem(PagingVO pagingVO) {
//		return itemMapper.selectItem(pagingVO);
//	}
//	
	
	
}

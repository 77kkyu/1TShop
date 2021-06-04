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
	
	//���� ��ǰ ���
	@Override
	public List<ItemVO> mainListItem() throws Exception{
		return itemMapper.mainListItem();
	}
	
	//ī�װ��� ��ǰ ���
	@Override
	public List<ItemVO> cateList() throws Exception {
		return itemMapper.cateList();
	}

//	//��ǰ �� ����
//	@Override
//	public int countItem() {
//		return itemMapper.countItem();
//	}
//	
//	//����¡ ó�� ��ǰ ��ȸ
//	@Override
//	public List<ItemVO> selectItem(PagingVO pagingVO) {
//		return itemMapper.selectItem(pagingVO);
//	}
//	
	
	
}

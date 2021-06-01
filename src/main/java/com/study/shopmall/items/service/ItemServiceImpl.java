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

	//���� ��ǰ ���
	@Override
	public List<ItemVO> listItem() {
	
		return itemDAO.listItem();
	}
	
	
	
}

package com.study.shopmall.items.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.study.shopmall.items.vo.ItemVO;

@Repository
public class ItemDAOImpl implements ItemDAO {

	@Inject
	SqlSession sqlSession;

	//메인 상품 목록
	@Override
	public List<ItemVO> listItem() {
		return sqlSession.selectList("com.study.mappers.itemMapper.mainListItem");
	}
	
	
	
}

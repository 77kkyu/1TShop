package com.study.shopmall.items.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.study.shopmall.items.vo.ItemVO;

@Repository
public class ItemDAOImpl implements ItemDAO {
	
	private static final String namespace = "com.study.shopmall.itemMapper";
	
	@Inject
	SqlSession sqlSession;

	//메인 상품 목록
	@Override
	public List<ItemVO> mainListItem() throws Exception{
		return sqlSession.selectList(namespace+".mainListItem");
	}

	@Override
	public List<ItemVO> cateList() throws Exception {
		return sqlSession.selectList(namespace+".cateList");
	}
	
	
	
}

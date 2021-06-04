package com.study.shopmall.general.items.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ItemCategoryVO {
	private String itemCategory;
	private String itemCategoryName;
	private String itemCategoryRefCode;
	
}


/*
item_category	varchar(30)	NO	PRI	
item_category_name	varchar(50)	NO		
itme_category_ref_code	varchar(30)	YES		
*/
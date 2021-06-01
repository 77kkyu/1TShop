package com.study.shopmall.items.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ItemVO {	
	
	private int itemNo;
	private String itemCategory;
	private String itemName;
	private String itemContent;
	private int itemPrice;
	private int itemSalePrice;
	private int itemStock;
	private String itemRefundYn;
	private int itemViewCnt;
	private String itemImage;
}
 

/*
item_no	int(11)	NO	PRI	
item_category	varchar(30)	NO		
item_name	varchar(45)	NO		
item_content	text	NO		
item_price	int(30)	NO		
item_sale_price	int(30)	NO		
item_stock	int(11)	NO		
item_refund_yn	enum('Y','N')	NO		N
item_viewcnt	int(11)	NO		
item_thumbnail	varchar(45)	NO		*/
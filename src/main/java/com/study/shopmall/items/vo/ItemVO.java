package com.study.shopmall.items.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ItemVO {	
	
	private int item_No;
	private String item_Category;
	private String item_Name;
	private String item_Content;
	private int item_Price;
	private int item_Sale_Price;
	private int item_Stock;
	private String item_RefundYn;
	private int item_View_Cnt;
	private String item_Image;
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
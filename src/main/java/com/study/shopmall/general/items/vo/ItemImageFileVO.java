package com.study.shopmall.general.items.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ItemImageFileVO {

	private int fileNo;
	private int itemNo;
	private String originFileName;    //���� ���� �̸�
	private String storedFileName;    //������ ���� �� ���� �̸�
	private String storedThumnail;     //����� �̹���
	private String thumnailYn;         //��ǥ ����� ����
	private int fileSize;
	private Timestamp fileRegdate;     //���� ���� ��¥
	private String fileDeleteYn; 
	
	
}

/*
file_no	int(11)	NO	PRI	
item_no	int(11)	NO		
origin_file_name	varchar(300)	NO		
stored_file_name	varchar(300)	NO		
stored_thumbnail	varchar(300)	NO		
thumnail_yn	enum('Y','N')	NO		N
file_size	int(11)	NO		
file_regdate	datetime	NO		
file_delete_yn	enum('Y','N')	NO		N
*/

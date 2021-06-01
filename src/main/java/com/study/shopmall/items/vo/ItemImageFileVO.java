package com.study.shopmall.items.vo;

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
	private String originFileName;    //원본 파일 이름
	private String storedFileName;    //서버에 저장 될 파일 이름
	private String storedThumnail;     //썸네일 이미지
	private String thumnailYn;         //대표 썸네일 여부
	private int fileSize;
	private Timestamp fileRegdate;     //파일 생성 날짜
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

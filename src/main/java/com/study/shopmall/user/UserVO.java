package com.study.shopmall.user;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserVO {
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userAddress1;
	private String userAddress2;
	private Timestamp userRegdate;
	private String userDeleteYn;
	private String userEmailYn;
	private String userGrade;
}

/*
user_no	int(11)	NO	PRI	
user_id	varchar(30)	NO		
user_pw	varchar(50)	NO		
user_name	varchar(20)	NO		
user_phone	varchar(20)	NO		
user_email	varchar(50)	NO		
user_address1	varchar(60)	YES		
user_address2	varchar(60)	YES		
user_regdate	datetime	NO		
user_delete_yn	enum('Y','N')	NO		N
user_email_yn	enum('Y','N')	NO		N
user_grade	varchar(10)	NO		
*/
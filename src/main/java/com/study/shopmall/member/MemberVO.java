package com.study.shopmall.member;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
	private int user_no;
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_phone;
	private String user_email;
	private String user_address1;
	private String user_address2;
	private Timestamp user_regdate;
	private String user_delete_yn;
	private String user_email_yn;
	private String user_grade;
}

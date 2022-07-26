package com.study.springboot.dto;

import lombok.Data;

@Data
public class ReplyDTO {

	private int reply_idx;	// 기본키
	private String reply_name;	// 이름
	private String reply_content;	// 내용
	private String reply_date;	// 작성일
	private int reply_board_idx;	// 외래키

	public ReplyDTO() {

	}

	public ReplyDTO(int reply_idx, String reply_name, String reply_content, String reply_date, int reply_board_idx) {

		super();
		this.reply_idx = reply_idx;
		this.reply_name = reply_name;
		this.reply_content = reply_content;
		this.reply_date = reply_date;
		this.reply_board_idx = reply_board_idx;

	}

}

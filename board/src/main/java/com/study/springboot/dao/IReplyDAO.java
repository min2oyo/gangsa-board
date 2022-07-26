package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.ReplyDTO;

@Mapper	// Mybatis와 인터페이스 함수를 연결
public interface IReplyDAO {

	// 댓글 목록
	public List<ReplyDTO> reply_list(String reply_board_index);

	// 댓글 전송
	public int reply_write(String reply_content, String reply_name, String reply_board_index);

	// 댓글 삭제
	public int reply_deleteDTO(String reply_idx);

}
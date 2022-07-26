package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.BoardDTO;

@Mapper	// Mybatis와 인터페이스 함수를 연결
public interface IBoardDAO {

	// 전체 목록
	public List<BoardDTO> list();

	// 글쓰기 전송
	public int write(String board_name, String board_title, String board_content);

	// 글보기 이동
	public BoardDTO viewDTO(String board_idx);

	// 글수정 이동
	public int updateDTO(String board_idx, String board_name, String board_title, String board_content);

}

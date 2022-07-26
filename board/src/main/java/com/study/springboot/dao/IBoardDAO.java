package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.BoardDTO;

@Mapper	// Mybatis와 인터페이스 함수를 연결
public interface IBoardDAO {

	public List<BoardDTO> list();

	public int write(String board_name, String board_title, String board_content);

}

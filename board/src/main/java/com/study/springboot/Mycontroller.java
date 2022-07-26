package com.study.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.dao.IBoardDAO;
import com.study.springboot.dto.BoardDTO;

@Controller
public class Mycontroller {

	@Autowired	// 자동으로 빈을 생성
	IBoardDAO boardDAO;

	// 메인
	@RequestMapping("/")
	public String root() {

		return "redirect:listForm";

	}

	// 메인 test
//	@RequestMapping("/")
//	@ResponseBody // 문자열 호출
//	public String root() {
//		return "root() 호출";
//	}

	// 전체 목록
	@RequestMapping("/listForm")
	public String listForm(Model model) {

		List<BoardDTO> list = boardDAO.list();
		model.addAttribute("list", list);

		System.out.println(boardDAO.list());

		return "listForm";

	}

	// 글쓰기 이동
	@RequestMapping("/writeForm")
	public String writeForm() {

		return "writeForm";

	}

	// 글쓰기 전송
	@RequestMapping("/writeAction")
	public String writeAction(@RequestParam("board_name") String board_name, @RequestParam("board_title") String board_title, @RequestParam("board_content") String board_content) {

		int result = boardDAO.write(board_name, board_title, board_content);

		if (result == 1) {
			System.out.println("글쓰기 성공!");
			return "redirect:listForm";
		} else {
			System.out.println("글쓰기 실패!");
			return "redirect:writeForm";
		}

	}

	// 글보기 이동
	@RequestMapping("/contentFrom")
	public String contentForm(@RequestParam("board_idx") String board_idx, Model model) {

		BoardDTO dto = boardDAO.viewDTO(board_idx);
		System.out.println("dto: " + dto);
		model.addAttribute("dto", dto);

		return "contentForm";

	}

}

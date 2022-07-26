package com.study.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.dao.IBoardDAO;
import com.study.springboot.dto.BoardDTO;

@Controller
public class Mycontroller {

	@Autowired	// 자동으로 빈을 생성
	IBoardDAO boardDAO;

	@RequestMapping("/")
	public String root() {

		return "redirect:listForm"; // listForm으로 리다이렉트 됨

	}

//	@RequestMapping("/")
//	@ResponseBody // 문자열 호출
//	public String root() {
//		return "root() 호출";
//	}

	@RequestMapping("/listForm")
	public String listForm(Model model) {

		List<BoardDTO> list = boardDAO.list();
		model.addAttribute("list", list);

		System.out.println(boardDAO.list());

		return "listForm"; // "listForm.jsp" 디스패치 해줌

	}

}

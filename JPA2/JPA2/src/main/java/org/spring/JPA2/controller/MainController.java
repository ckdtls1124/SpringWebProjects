package org.spring.JPA2.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.RequiredArgsConstructor;
import org.spring.JPA2.dto.Board0112DTO;
import org.spring.JPA2.entity.Board0112;
import org.spring.JPA2.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
//@RequestMapping("/action")
@RequiredArgsConstructor
public class MainController {

//    First way
//    @Autowired
//    private BoardService boardService;

//    Second way

    @Autowired
    private BoardService boardService;
    private MainController(BoardService boardService){
        this.boardService=new BoardService();
    }

    @GetMapping("/writeBoard")
    public String viewBoard(){
        return "board/writeBoard";
    }

    @PostMapping("/writeDo")
    public String writeBoardDo(@ModelAttribute Board0112DTO dto){
       boardService.insertBoard1(dto);
        return "redirect:boardList";
    }

    @GetMapping("/boardList")
    public String showBoardList(Model model){
        List<Board0112DTO> lists= boardService.lists();
        model.addAttribute("boardList", lists);
        return "board/boardList";
    }

//    @PostMapping("/post.do")
//    public String postBoardDo(@ModelAttribute("dto") Board0112DTO dto, Model model){
//        model.addAttribute("member", dto);
//        return "board/postBoard";
//    }
}

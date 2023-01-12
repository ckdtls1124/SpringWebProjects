package org.spring.JPA2.service;

import lombok.RequiredArgsConstructor;
import org.spring.JPA2.dto.Board0112DTO;
import org.spring.JPA2.entity.Board0112;
import org.spring.JPA2.repository.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepo boardRepo;



//    First way
//    change DTO object to Entity object
    public void insertBoard1(Board0112DTO dto){

        Board0112 board0112=new Board0112();
        board0112.setId(dto.getId());
        board0112.setCnt(dto.getCnt());
        board0112.setTitle(dto.getTitle());
        board0112.setContent(dto.getContent());
        board0112.setWriter(dto.getWriter());
        board0112.setCreate_date(dto.getCreate_date());
        boardRepo.save(board0112);
    }

    public List<Board0112DTO> lists(){

        List<Board0112DTO> dtoList=new ArrayList<>();

        List<Board0112> entityList=boardRepo.findAll();
        for(Board0112 each:entityList){
            dtoList.add(Board0112.toBoard0112dto(each));
        }

        return dtoList;

    }

//    Second way
//    Use Entity Object directly
    public void insertBoard2(Board0112 b){
        boardRepo.save(b);
    }

}

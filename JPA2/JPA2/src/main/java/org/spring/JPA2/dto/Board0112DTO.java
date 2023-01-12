package org.spring.JPA2.dto;

import lombok.*;
import org.spring.JPA2.entity.Board0112;


import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Board0112DTO {
    private Long id;
    private Long cnt=0L;
    private String title;
    private String content;
    private String writer;
    private Date create_date=new Date();

//    @CreatedDate
//    private LocalDateTime createDate2;
//
//    @LastModifiedDate
//    private LocalDateTime updateDate2;



    //    DTO -> Entity 변환
    public static Board0112 toEntity(Board0112DTO dto){
        Board0112 board0112=new Board0112();
        board0112.setId(board0112.getId());
        board0112.setCnt(board0112.getCnt());
        board0112.setTitle(board0112.getTitle());
        board0112.setContent(board0112.getContent());
        board0112.setWriter(board0112.getWriter());
        board0112.setCreate_date(board0112.getCreate_date());

        return board0112;
    }

}

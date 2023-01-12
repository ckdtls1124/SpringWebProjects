package org.spring.JPA2.entity;

import lombok.*;
import org.spring.JPA2.dto.Board0112DTO;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "boardEx")
public class Board0112 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(nullable = false)
    private Long cnt = 0L;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private Date create_date;

//    @CreatedDate
//    private LocalDateTime createDate2;
//
//    @LastModifiedDate
//    private LocalDateTime updateDate2;

    //    Entity -> DTO 변환
    public static Board0112DTO toBoard0112dto(Board0112 board0112) {
        Board0112DTO board0112DTO = new Board0112DTO();
        board0112DTO.setId(board0112.getId());
        board0112DTO.setCnt(board0112.getCnt());
        board0112DTO.setTitle(board0112.getTitle());
        board0112DTO.setContent(board0112.getContent());
        board0112DTO.setWriter(board0112.getWriter());
        board0112DTO.setCreate_date(board0112.getCreate_date());

        return board0112DTO;
    }

}

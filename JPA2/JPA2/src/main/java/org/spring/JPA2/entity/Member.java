package org.spring.JPA2.entity;

import lombok.*;
import org.spring.JPA2.dto.MemberDTO;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "memberEx")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String userpw;

    //DTO -> Entity로 변환
    public static Member addMember(MemberDTO memberDTO) {
        Member member = new Member();
        member.setId(memberDTO.getId());
        member.setUsername(memberDTO.getUsername());
        member.setUserpw(memberDTO.getUserpw());
        member.setEmail(memberDTO.getEmail());
        return member;
    }


}

package org.spring.JPA2.dto;

import lombok.*;
import org.spring.JPA2.entity.Member;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private Long id;
    private String email;
    private String username;
    private String userpw;

    //    Entity -> DTO로 변환
    public static MemberDTO addMemberDTO(Member member) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(member.getId());
        memberDTO.setUsername(member.getUsername());
        memberDTO.setUserpw(member.getUserpw());
        memberDTO.setEmail(member.getEmail());
        return memberDTO;
    }

}

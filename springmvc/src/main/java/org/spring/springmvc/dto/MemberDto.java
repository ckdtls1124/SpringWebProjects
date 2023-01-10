package org.spring.springmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@ToString                       // -> lombok 기본 
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

	private String userName;
	private String userPw;
	private String userAge;
	
	
}

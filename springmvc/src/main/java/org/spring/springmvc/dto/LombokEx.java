package org.spring.springmvc.dto;

public class LombokEx {

	public static void main(String[] args) {
		
		MemberDto dto=new MemberDto();
		
		dto.setUserName("m1");
		dto.setUserPw("11");
		dto.setUserAge("11");
		System.out.println(dto.getUserName());
		System.out.println(dto.getUserPw());
		System.out.println(dto.getUserAge());
		dto.toString();
	}
}

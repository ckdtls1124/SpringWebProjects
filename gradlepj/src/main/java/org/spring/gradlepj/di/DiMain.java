package org.spring.gradlepj.di;

import org.springframework.beans.factory.annotation.Autowired;

public class DiMain {
	
	//1. DI 생성자를 통해서 주입
	private DiSub diSub;
	
	public DiMain(DiSub diSub) {
		this.diSub=diSub;
	}
	//2.DI setter를 통해서 주입
	public void setDiSub(DiSub diSub) {
		this.diSub = diSub;
	}
	//3.DI를 통해서 주입 @Autowired
	@Autowired
	private DiSub diSub2;
	
	public static void main(String[] args) {
		// 일반적인 자바
		DiSub d1= new DiSub();//강한 결합 //내가 결정
		
	}

}

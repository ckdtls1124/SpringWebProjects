package org.spring.gradlepj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradlepjApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("테스트");
	}
	
	@Test
	void calculatorAddTest() {
		Calculator cal=new Calculator();
		
		assertEquals(10, cal.add(10, 10));
		System.out.println("단위 테스트");
	}
	
	@Test
	void calculatorSubTest() {
		Calculator cal=new Calculator();
		
		assertEquals(10, cal.add(10, 10));
		System.out.println("단위 테스트");
	}

	
	
	
}

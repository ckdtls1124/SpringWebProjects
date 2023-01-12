package org.spring.JPA2;

import org.junit.jupiter.api.Test;
import org.spring.JPA2.dto.Board0112DTO;
import org.spring.JPA2.entity.Board0112;
import org.spring.JPA2.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

@SpringBootTest

class Jpa2ApplicationTests {

	@Autowired
	private BoardService boardService;

	@Test
	void contextLoads() {

	}

}

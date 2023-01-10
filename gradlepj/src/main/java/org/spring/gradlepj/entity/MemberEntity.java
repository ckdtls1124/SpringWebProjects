package org.spring.gradlepj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemberEntity {
	@Id
	private Long id;
}

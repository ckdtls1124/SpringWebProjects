package org.spring.gradlepj.repository;

import org.spring.gradlepj.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{
	//DAO, DB연동, SQL, CRUD
}

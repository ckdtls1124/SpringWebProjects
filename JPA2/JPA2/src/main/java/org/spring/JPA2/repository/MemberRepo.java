package org.spring.JPA2.repository;

import org.spring.JPA2.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface MemberRepo extends JpaRepository<Member, Long> {
//    @Override
//    Optional<Member> findById(Long aLong); // 상세조회
//
//    @Override
//    Page<Member> findAll(Pageable pageable); // paging
//
//    @Override
//    <S extends Member> S save(S entity); // register, modify
//
//    @Override
//    List<Member> findAll(); //Find all lists
//
//    @Override
//    List<Member> findAllById(Iterable<Long> longs); // select lists where id
//
////    Customize
//
//    Optional<Member> findByEmail(String email); //Select lists where email
//
//    Optional<Member> findByEmailORUsername(String email, String username);

}


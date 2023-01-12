package org.spring.JPA2.repository;

import org.spring.JPA2.entity.Board0112;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepo extends JpaRepository<Board0112, Long> {




}

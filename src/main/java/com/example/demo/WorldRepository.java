package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorldRepository extends JpaRepository<World, Integer> {

    public List<World> findByLangEndingWith(String lang);  //메소드의 이름이 중요 findBy[XXXX]Like 컬럼이 된다.

}

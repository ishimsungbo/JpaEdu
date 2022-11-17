package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    public List<Country> findByLangEndingWith(String lang);  //메소드의 이름이 중요 findBy[XXXX]Like 컬럼이 된다.

}

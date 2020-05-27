package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

public interface ActorRepository extends CrudRepository<Actor, Long> {

//    Iterator findAllByYear(Long year);
//
//    Iterator findAllByYearOrderByYear(Long year);
//
//    Iterator findAllByYearAAndRealName(Long year, String realName);
//
//    Boolean existsActorByRealName(String realName);
//
//    Actor findFirstByYear(Long year);

}

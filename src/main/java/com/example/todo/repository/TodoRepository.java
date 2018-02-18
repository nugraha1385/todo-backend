package com.example.todo.repository;

import com.example.todo.pojo.Todos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Indrap on 19/01/2018.
 */
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends MongoRepository<Todos,String>{
    List<Todos> findByUserId(@Param("userId") String userId);


}

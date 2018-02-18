package com.example.todo.repository;

import com.example.todo.pojo.Lookups;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Indrap on 23/01/2018.
 */

@RepositoryRestResource(collectionResourceRel = "lookups", path = "lookups")
public interface LookupsRepository extends MongoRepository<Lookups, String> {

}

package com.narayan.wwebjpathymeleafmysql.Repositories;

import com.narayan.wwebjpathymeleafmysql.Entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, String >{
}

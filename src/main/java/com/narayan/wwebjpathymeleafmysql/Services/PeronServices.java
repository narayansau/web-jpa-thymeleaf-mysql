package com.narayan.wwebjpathymeleafmysql.Services;

import com.narayan.wwebjpathymeleafmysql.Entity.PersonEntity;

import java.util.List;
import java.util.Optional;

public interface PeronServices{
    PersonEntity createPerson( PersonEntity personEntity);
    Optional <PersonEntity> getPerson(String id);
    PersonEntity editPerson ( PersonEntity personEntity);
    void deletePerson(String id);
    void deletePerson ( PersonEntity personEntity);
    List <PersonEntity> getAllPersons(int pageNumber , int pageSize);
    List <PersonEntity> getAllPersons();
}

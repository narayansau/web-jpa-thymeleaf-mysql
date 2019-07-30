package com.narayan.wwebjpathymeleafmysql.PersonServiceImplimentation;

import com.narayan.wwebjpathymeleafmysql.Entity.PersonEntity;
import com.narayan.wwebjpathymeleafmysql.Repositories.PersonRepository;
import com.narayan.wwebjpathymeleafmysql.Services.PeronServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImplimentation implements PeronServices{

  private PersonRepository personRepository;

    @Autowired
    public PersonServiceImplimentation(PersonRepository personRepository) {
        this.personRepository=personRepository;
    }

    @Override
    public PersonEntity createPerson(PersonEntity personEntity) {
        return personRepository.save(  personEntity);
    }

    @Override
    public Optional <PersonEntity> getPerson(String id) {
        Optional <PersonEntity> mePerson =  personRepository.findById(  id );

        return mePerson;
    }

    @Override
    public PersonEntity editPerson(PersonEntity personEntity) {
        return  personRepository.save(  personEntity);
    }

    @Override
    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public void deletePerson(PersonEntity personEntity) {
        personRepository.delete(personEntity);
    }

    @Override
    public List <PersonEntity> getAllPersons(int pageNumber, int pageSize) {
       // return  personRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();;
    return null;
    }

    @Override
    public List <PersonEntity> getAllPersons() {
        return (List <PersonEntity>) personRepository.findAll();
    }
}

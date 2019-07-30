package com.narayan.wwebjpathymeleafmysql.Controller;


import com.narayan.wwebjpathymeleafmysql.Entity.PersonEntity;
import com.narayan.wwebjpathymeleafmysql.PersonServiceImplimentation.PersonServiceImplimentation;
import com.narayan.wwebjpathymeleafmysql.Services.PeronServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController{

    private final PeronServices  personServices;

    @Autowired
    public PersonController(PeronServices personServices) {
        this.personServices=personServices;
    }

    @RequestMapping(value="/" , method=RequestMethod.GET)
    public  String homePage(Model model) {
        model.addAttribute( "person" , new PersonEntity() );
        return "index";
    }

    @RequestMapping(value = "/call_add", method = RequestMethod.POST)
    public String addPagePerson(@ModelAttribute PersonEntity person, Model model) {
        personServices.createPerson(person);
        model.addAttribute("persons", personServices.getAllPersons());
        return "result";
    }

}

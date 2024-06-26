package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService service = classPathXmlApplicationContext.getBean(PersonService.class);
        Person ivan = service.getByName("Vlad");

        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}

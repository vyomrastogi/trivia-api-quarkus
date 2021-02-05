package com.trivia;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class QuestionRepository implements PanacheRepository<Question> {
    
}

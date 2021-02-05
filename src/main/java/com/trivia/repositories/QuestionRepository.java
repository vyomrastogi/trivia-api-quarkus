package com.trivia.repositories;

import javax.enterprise.context.ApplicationScoped;

import com.trivia.entities.Question;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class QuestionRepository implements PanacheRepository<Question> {
    
}

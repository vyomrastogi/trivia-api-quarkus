package com.trivia.models;

import java.util.ArrayList;
import java.util.List;

import com.trivia.entities.Question;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class TriviaResponse {
    
    List<Question> questions;

    public TriviaResponse(List<Question> questions) {
        this.questions = questions;
	}

    public TriviaResponse(){
        this.questions = new ArrayList<>();        
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


}

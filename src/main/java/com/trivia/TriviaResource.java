package com.trivia;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/trivia/questions")
public class TriviaResource {

    @Inject
    QuestionRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TriviaResponse getAllQuestions() {
        return new TriviaResponse(repository.listAll());
    }
}
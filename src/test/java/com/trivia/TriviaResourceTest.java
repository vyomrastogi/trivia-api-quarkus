package com.trivia;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class TriviaResourceTest {

    @Test
    public void testGetAllQuestion_returnsQuestions() {
        given()
          .when().get("/api/v1/trivia/questions")
          .then()
             .statusCode(200)
             .body("questions.size()", is(2) ,
                   "questions[0].timestamp", notNullValue(),
                   "questions[0].question", notNullValue(),
                   "questions[0].answers", notNullValue(),
                   "questions[0].questionNumber", notNullValue(),
                   "questions[0].answers.size()", is(3),
                   "questions[0].answers[0].text", notNullValue(),
                   "questions[0].answers[0].correct", notNullValue(),
                   "questions[0].answers[0].choice", notNullValue(),
                   "questions[0].quizId", notNullValue());
    }

}
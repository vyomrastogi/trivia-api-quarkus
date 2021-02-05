package com.trivia;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "/api/v2/trivia/questions")
public interface TriviaPanacheResource extends PanacheEntityResource<Question,Long>{
    
}

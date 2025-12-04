package com.agarere.dfxserveyapi.controller;

import com.agarere.dfxserveyapi.entity.Question;
import com.agarere.dfxserveyapi.repository.QuestionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    private final QuestionRepository repository;

    public QuestionController(QuestionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/questions")
    public List<Question> getAll() {
        return repository.findAll();
    }
}


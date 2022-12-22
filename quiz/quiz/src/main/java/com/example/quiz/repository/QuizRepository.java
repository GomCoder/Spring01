package com.example.quiz.repository;

import com.example.quiz.entry.Quiz;
import org.springframework.data.repository.CrudRepository;

//Quiz 테이블: RepositoryImpl
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
}

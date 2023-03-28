package dev.darsaras.springreactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import dev.darsaras.springreactive.model.Student;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student,Long>{
    
    Flux<Student> findAllByFirstnameIgnoreCase(String firstname);
}

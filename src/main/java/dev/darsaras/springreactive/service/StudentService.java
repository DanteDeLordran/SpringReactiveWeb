package dev.darsaras.springreactive.service;

import org.springframework.stereotype.Service;

import dev.darsaras.springreactive.model.Student;
import dev.darsaras.springreactive.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {
 
    private final StudentRepository studentRepository;

    //Flux = List of objects
    public Flux<Student> findAll(){
        return studentRepository.findAll();
    }

    //Mono = Single object
    public Mono<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public Mono<Student> createNewStudent(Student student){
        return studentRepository.save(student);
    }
}

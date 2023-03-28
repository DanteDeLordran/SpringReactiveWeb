package dev.darsaras.springreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.darsaras.springreactive.model.Student;
import dev.darsaras.springreactive.service.StudentService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    
    private final StudentService studentService;

    @PostMapping("/new")
    public Mono<Student> createNewStudent(@RequestBody Student student){
        return studentService.createNewStudent(student);
    }

    @GetMapping("/all")
    public Flux<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable Long id){
        return studentService.findById(id);
    }

}

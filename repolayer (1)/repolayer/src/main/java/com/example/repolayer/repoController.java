package com.example.repolayer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class repoController {
    private final repoRepository repository=new repoRepository();
    @GetMapping
    public List<repoModel> getStudents()
    {
        return repository.findAll();
    }
    @PostMapping
    public repoModel addStudent(@RequestBody repoModel r)
    {
        repository.save(r);
        return r;

    }
}

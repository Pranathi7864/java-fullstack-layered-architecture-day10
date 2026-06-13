package com.example.repolayer;

import java.util.ArrayList;
import java.util.List;

public class repoRepository {
    private final List<repoModel> repo=new ArrayList<>();
    public List<repoModel> findAll()
    {
        return repo;

    }
    public void save(repoModel r)
    {
        repo.add(r);

    }
}


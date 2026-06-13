package com.example.repolayer;

public class repoModel {
    private String name;
    private Long id;
    public  repoModel(String name, Long id)
    {
        this.id=id;
        this.name=name;
    }
    public Long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

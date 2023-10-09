package org.example.models;

import java.util.List;

// Professor
public class User {
    private String name;
    private int age;
    private List<Lecture> finishedLectures;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package edu.javacourse.ext;

public class Student {
    private Integer id;
    private String name;
    private String lastName;
    private Street street;

    public Student(Integer id, String name, String lastName, Street street) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.street = street;
    }
}

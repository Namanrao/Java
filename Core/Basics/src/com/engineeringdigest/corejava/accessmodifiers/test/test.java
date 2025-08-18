package com.engineeringdigest.corejava.accessmodifiers.test;

import com.engineeringdigest.corejava.accessmodifiers.school.Student;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 12;
        student.name = "Ram";
    }
}
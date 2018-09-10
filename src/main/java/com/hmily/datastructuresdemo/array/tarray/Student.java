package com.hmily.datastructuresdemo.array.tarray;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int score;

    public Student(int studentId, String studentName, int studentScore){
        name = studentName;
        score = studentScore;
        id = studentId;
    }

    @Override
    public String toString(){
        return String.format("Student(id: %s, name: %s, score: %d)", id, name, score);
    }

}

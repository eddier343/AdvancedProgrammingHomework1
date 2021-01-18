package com.company.unitmark;

public class Student {

    public String name;
    public UnitMark[] marks;

    public Student(String name, UnitMark[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(UnitMark[] marks) {
        this.marks = marks;
    }

    public float calculateOverallGrade() {
        float overallGrade = 0;
        for (int i = 0; i < this.marks.length-1;  i++) {
            overallGrade += marks[i].CalculateUnitGrade();
        }
        return overallGrade/this.marks.length;
    }
}

package com.company.unitmark;

public class Main {

    public static void main(String[] args) {

        UnitMark[] marks = new UnitMark[3];

        UnitMark unitMark = new UnitMark(100,100);
        System.out.println(unitMark.CalculateUnitClassification());
        marks[0] = unitMark;

        UnitMark unitMark2 = new UnitMark(65,66);
        System.out.println(unitMark2.CalculateUnitClassification());
        marks[1] = unitMark2;

        UnitMark unitMark3 = new UnitMark(54,52);
        System.out.println(unitMark3.CalculateUnitClassification());
        marks[2] = unitMark3;

        UnitMark[] marks2 = new UnitMark[3];

        UnitMark unitMark4 = new UnitMark(21,38);
        System.out.println(unitMark4.CalculateUnitClassification());
        marks2[0] = unitMark4;

        UnitMark unitMark5 = new UnitMark(64,66);
        System.out.println(unitMark5.CalculateUnitClassification());
        marks2[1] = unitMark5;

        UnitMark unitMark6 = new UnitMark(65,61);
        System.out.println(unitMark6.CalculateUnitClassification());
        marks2[2] = unitMark6;

        UnitMark[] marks3 = new UnitMark[3];

        UnitMark unitMark7 = new UnitMark(72,66);
        System.out.println(unitMark7.CalculateUnitClassification());
        marks3[0] = unitMark7;

        UnitMark unitMark8 = new UnitMark(99,36);
        System.out.println(unitMark8.CalculateUnitClassification());
        marks3[1] = unitMark8;

        UnitMark unitMark9 = new UnitMark(65,66);
        System.out.println(unitMark9.CalculateUnitClassification());
        marks3[2] = unitMark9;

        Student student = new Student("Geoff", marks);
        System.out.println(student.calculateOverallGrade());

        Student student2 = new Student("Dave", marks2);
        System.out.println(student2.calculateOverallGrade());

        Student student3 = new Student("Eddie", marks3);
        System.out.println(student3.calculateOverallGrade());

    }

}

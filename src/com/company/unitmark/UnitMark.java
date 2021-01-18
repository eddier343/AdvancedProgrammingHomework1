package com.company.unitmark;

public class UnitMark {

    public int coursework1Mark;
    public int coursework2Mark;

    public UnitMark(int coursework1Mark, int coursework2Mark) {
        this.coursework1Mark = coursework1Mark;
        this.coursework2Mark = coursework2Mark;
    }

    public double CalculateUnitGrade() {
        return (this.coursework1Mark + this.coursework2Mark)/2;
    }

    public String CalculateUnitClassification() {
        double courseMark = CalculateUnitGrade();
        if (courseMark >= 70) {
            return "I";
        }
        if (courseMark >= 60 && courseMark < 70) {
            return "II(I)";
        }
        if (courseMark >= 50 && courseMark < 60) {
            return "II(II)";
        }
        if (courseMark >= 40 && courseMark < 50) {
            return "III";
        }
        if (courseMark < 40) {
            return "Fail";
        }
        return null;
    }

}

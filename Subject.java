/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3guitest;

import java.io.Serializable;
import java.util.ArrayList;

class Subject implements Cloneable, Serializable {

    private String subjectName;
    private String subjectCode;
    private int subjectCreditPoint;
   // private ArrayList<Student> studentList;

    public Subject() {
     //   studentList = new ArrayList<Student>();
        this.subjectCode = "";
        this.subjectName = "";
        this.subjectCreditPoint = 0;
    }

    //Parameterised Constructors
    public Subject(String subjectCode, String subjectName, int subjectCreditPoint) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectCreditPoint = subjectCreditPoint;
       // studentList = new ArrayList<Student>();

    }

    //Getters and Setters
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public int getSubjectCreditPoint() {
        return subjectCreditPoint;
    }

    public void setSubjectCreditPoint(int subjectCreditPoint) {
        this.subjectCreditPoint = subjectCreditPoint;
    }

    //Print the subjects
    public String toString() {
        String s=subjectCode + "\t(" + subjectName + ", " + subjectCreditPoint + "pt)";
        return s;
    }

    public boolean isSame(Subject object) {
        //for (Subject s : object) {
        return ((subjectName == object.subjectName) && (subjectCode == object.subjectCode) && (subjectCreditPoint == object.subjectCreditPoint));
        //}
    }

    @Override
    protected Subject clone() throws CloneNotSupportedException {
        return (Subject) super.clone();
    }

}

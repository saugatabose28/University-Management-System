/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3guitest;

import java.io.Serializable;
import java.util.ArrayList;

class Course implements Serializable {

    private String courseName;
    private ArrayList<Subject> coreSubjectList;
    private ArrayList<Subject> electiveSubjectList;
    private ArrayList<Major> majorList;
    private int minimalCreditPoint;
    int courseCredit;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Subject> getCoreSubjectList() {
        return coreSubjectList;
    }

    public void setCoreSubjectList(ArrayList<Subject> coreSubjectList) {
        this.coreSubjectList = coreSubjectList;
    }

    public ArrayList<Subject> getElectiveSubjectList() {
        return electiveSubjectList;
    }

    public void setElectiveSubjectList(ArrayList<Subject> electiveSubjectList) {
        this.electiveSubjectList = electiveSubjectList;
    }

    public ArrayList<Major> getMajorList() {
        return majorList;
    }

    public void setMajorList(ArrayList<Major> majorList) {
        this.majorList = majorList;
    }

    public int getMinimalCreditPoint() {
        return minimalCreditPoint;
    }

    public void setMinimalCreditPoint(int minimalCreditPoint) {
        this.minimalCreditPoint = minimalCreditPoint;
    }

    //Parameterised constructor
    public Course() {
        coreSubjectList = new ArrayList<Subject>();
        electiveSubjectList = new ArrayList<Subject>();
        majorList = new ArrayList<Major>();
        minimalCreditPoint = 0;
        courseName = "";
        courseCredit = 0;
    }

    public Course(String name, int credit) {
        courseName = name;
        courseCredit = credit;

        coreSubjectList = new ArrayList<Subject>();
        electiveSubjectList = new ArrayList<Subject>();
        majorList = new ArrayList<Major>();
        minimalCreditPoint = 0;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    void addCores(Subject[] cores) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Subject s : cores) {
            coreSubjectList.add(s);
        }
    }

    void addMajors(Major[] majors) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Major m : majors) {
            majorList.add(m);
        }
    }

    void addElectives(Subject[] eles) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Subject s : eles) {
            electiveSubjectList.add(s);
        }
    }

    //@Override
    public String toString() {
        System.out.println("Core Subjects:");
        for (Subject s : coreSubjectList) {
            System.out.println(s);
        }
        for (Major m : majorList) {
            System.out.println(m.getmName());
            System.out.println(m);
        }
        System.out.println("Elective Subjects: ");
        for (Subject s : electiveSubjectList) {
            System.out.println(s);
        }
        return ("-----------------");
    }

    String displayCores(Subject s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String s1 = "";
        s1 = s1 + s.toString() + "\n";
        return s1;
    }

    String displayMajors(Major m) {
        String s1 = "";
        s1 = s1 + m.getmName() + "\n";
        return s1;
    }

    String displayElectives(Subject s) {
        String s1 = "";
        s1 = s1 + s.toString() + "\n";
        return s1;
    }

   /* String displayMajorCores(Major m, Subject s) {
        String s1 = "";
        s1 += s + " \n";
        return s1;
    }*/

}

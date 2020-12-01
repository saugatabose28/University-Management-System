/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3guitest;

import java.util.ArrayList;

abstract class Student implements Cloneable, Enrollment {

    private String studentName;
    private String studentDOB;
    private String studentSex;//Student Gender
    private int studentNumber;
    //private transient Address address;
    private ArrayList<Record> record;

//Default Constructor
    public Student() {
        record = new ArrayList<Record>();
        this.studentName = "";
        this.studentDOB = "";
        this.studentSex = "";
        this.studentNumber = 0;
    }

    //Parameterised Constructor
    public Student(String studentName, int studentNumber, String studentSex, String studentDOB) {
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentSex = studentSex;
        this.studentNumber = studentNumber;
        record = new ArrayList<Record>();
    }

    public ArrayList<Record> getRecords() {
        return record;
    }

    public void setRecord(ArrayList<Record> record) {
        this.record = record;
    }

    //Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        for (Record r : record) {
            Record r1 = (Record) r.clone();
            student.record.add(r1);
        }
        return student;

    }

    public void addRecord(Record r) {
        record.add(r);
    }

    public void deletedRecord(int r) {
        record.remove(r);
    }

    public Record getRecord(int r) {
        Record retrievedRecord = record.get(r);
        return retrievedRecord;
    }

    //To string to output the student details
    public abstract String toString();
    //return (studentName + "\t" + "(" + studentNumber + ")");
    //}

    public abstract void setExpectedCompletion(String data);

    public abstract String getExpectedCompletion();

}
